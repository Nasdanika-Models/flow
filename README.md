# Flow

A flow model which supports inheritance of flows similar to inheritance in object-oriented languages with ability to suppress (hide) inherited elements.

Concepts:

* Action - a unit of execution. Action has:
    * Inputs - activate the action. May contain input data (payload)
    * Outputs - are called by the action logic to activate other actions/flows and pass data (payload) to them 
    * Responsibility assignments - mappings to participants with descriptions of what each participant is supposed to do. Responsibility assignments contain resource assignments - mappings to resources like tools with descriptions how a particular resource is used by a participant to accomplish their responsibility in achieving the action's goal.  
    * Requirements - Something required for action completion.
* Flow - a composite action. A flow contains child actions.
* Participant - somebody or something having responsibilities in accomplishing actions in one or more flows.
* Resource - something used by one or more participants to fulfill their responsibilities.
* Requirement - something that is required to complete an action, e.g. a capability to create a virtual machine. Resources and Participants can be considered to be types of requirements. Requirements can roll-up from activities to flows to packages and, if flows are contained in some other hierachy like an organizational hierarchy, along that hierarchy. If requirements have temporal dimension of availability, it would be possible to provide reporting on when a flow would be completed once a particular requirement is satisfied. E.g. "An application can be deployed to a cloud environment X days after creation of a cloud subscription" or "Coding will be completed Y days after hiring of Z developers".
* Data element - a unit of data (specification). Can be simple (Text, Number) or complex (Map, Object). May reference Ecore models.  
* Artifact - a form of payload. E.g. a diagram, a document, JSON file, XML file. Contains values of data elements. Can be stored in resources or reside in a resource. For example, a web form or a web page is an artifact residing in a web app. A JSON file is an artifact residing in a version control system.
* Connections:
    * Transition - passes payload and control from one activity to another.
    * Call - passes request from the source activity to the target activity and expects response back in order to complete the source activity 
* Package / Flow repository - a container of flows, resources, data elements, and participants.
* Service - action reference / binding - use of an action in one or more flows which do not contain the action. Binding means providing parameters for that particular instance of (re)use of the action. E.g. "Client ID" or "Client Secret"

The model may provide special type of activities for convenience - start, end, fork/join, port - input/output/call.

Model elements may maintain a list of issues and actions may collect duration metrics. They also may contain durations - scalar values or discributions. Durations may be derived from collected. 
All of this would allow to run simulations and report change in flow execution duration over time, e.g. as a result of implementing improvements.

## Inheritance

Actions in a flow are keyed by a string ID, as well as all other contained elements such as actions/flows/participants/resources/requirements in a package.
Therefore, inheritance/layering can be implemented in the same way as inheritance in object-oriented languages - by replacing inherited elements with elements defined in a sub-flow/sub-package matching by name. 
This approach is also similar to layers in Docker images - it also allows to delete (suppress) inherited elements, which is not allowed in object-oriented languages like Java.

Multiple inheritance means sequential application of base flows and then application of the sub-flow.

For example, ``flow C extends A, B`` would be loaded as follows:

* Flow ``A`` is loaded
* Flow ``B`` applied on top of ``A``
* Flow ``C`` applied on top of the result of the previous step

This approach also allows to have "mix-in" flows.

## Definition/specification

This section outlines a few option of creating flow definitions

### Drawio

Flow definitions can be created as [Drawio](https://www.drawio.com/) diagrams. A [Document](https://drawio.models.nasdanika.org/references/eClassifiers/Document/index.html) can be loaded as a flow package and 
[Pages](https://drawio.models.nasdanika.org/references/eClassifiers/Page/index.html) as flows with [Layers](https://drawio.models.nasdanika.org/references/eClassifiers/Layer/index.html]
and container [Nodes](https://drawio.models.nasdanika.org/references/eClassifiers/Node/index.html) as sub-flows. Element properties can be used to configure elements.  
Participants and resources can be modeled as diagram elements as well, e.g. as swimlane partitions.

* Pros
    * Ability to adapt existing diagrams
    * Drawio is a free tool with in-browser and desktop versions. Works with GitHub, GitLab, and Dropbox. Available in Confluence. There are several VS Code plug-ins.
    * Flows can be rendered as interactive diagrams in documentation. Diagrams can be open for editing in the browser.
    * Flow diagram can be "instrumented" during documentation generation. For example, background color can be adjusted based on status of in-flight flows, tooltip can provide a summary of in-flight flows, and a link would point to an activity page with detailed documentation and information.
* Cons
    * The tool does not provide assistance with property names. However, it is the case for many types of artifacts.
    * Complex definitions may become difficult to maintain as properties and would require helper definitions, e.g. in YAML. 
    
One way to author diagrams is to agree on a small number of properties with ``spec`` property being one of them and pointing to a YAML file with detailed specification/definition.

### YAML

YAML can be used to model flows. It is text-based and modeling of nesting and relationships would require from the modeler to build a mental picture first.
Auto-generated visualizations can be built from YAML definitions, but they might not be as good as manually created ones.
As such, YAML can be used to create definitions of well-understood and relatively small flows where documentation/communication is not the primary concern or where auto-generated visualizations are good enough. 

YAML can also be used for definitions of flows which inherit/extend other flows.

As it was mentioned above, YAML can be used in conjunction with Drawio. There are the following options:

* Drawio is used as a definition with details in YAML.
* The entire definition is in YAML and Drawio is used for visualization - diagram elements contain properties for linking them to flow elements in order to generate interactive diagrams in documentation. 

### Eclipse

There are several ways to work on flow definitions in Eclipse:

* Tree editor
* [Sirius](https://eclipse.dev/sirius/overview.html)-based diagram editor
* [Xtext](https://eclipse.dev/Xtext/)-based editor

All of them require Eclipse installation and some investment is creation and maintenance of respective editors.

## Execution

So far we were talking primarily about flow definitions/specification, which corresponds to classes in, say, Java. 
This section talks about instances, which corresponds objects in Java. 

There are two possible approaches:

* Prototype as in JavaScript - an instance is of the same type as its definition and has a reference to its definition (prototype). Inheritance also may be implemented this way.
* Class/Instance - this would require counterpart model elements. E.g. Activity -> ActivityInstance. It might be possible to use some kind of synonyms e.g. Activity -> Task. Or have a single runtime/execution model element. 

The prototype approach might be simpler, but it would result of mixing of different concerns.

Some options to implement flow execution:

* File-based flow execution:
    * Use a version control system, e.g. Git, GitHub or GitLab
    * Trigger flow execution on commit, e.g. using a web hook or on a regular basis - pool, iterate over commits since last run/pull
    * Commit is a unit of change - an event. In the case of a periodic pull multiple commits can be combined into a single unit of change
    * Action executors inspect commits to determine whether there is work for them. E.g. an executor may "watch" an "input queue" folder and perform activity for every file in that folder. 
    * Action executors may modify the content of the repository and commit changes - it would trigger other executors. E.g. an executor may write a file to the input queue folder for another executor.
    * With this approach humans may inspect the flow and participate in the flow in the same way as automated participants.
* GitLab-based flow execution:
    * Executors are activated by web hooks
    * They use [GitLab model](https://github.com/Nasdanika-Models/gitlab) or [gitlab4j-api](https://github.com/gitlab4j/gitlab4j-api) to pull commit info and decide whether they need to act on it. They may also use the aforementioned methods to access repository files they need and commit changes. They may operate on the model level and the model would abstract low-level operations. Custom URIConverter and URIHandler can be used to access repository files as model resources using, say, ``gitlab`` URI scheme: ``gitlab://<server alias>/<project alias or id>/<branch>/<repository path>``. With this approach select files from multiple repositories may be accessed and manipulated without having to close entire repositories. Changes can be committed when action processing is completed using some form of 2-phase commit if committing to more than one data source.
* Jira-based flow execution:
    * External ID is used to match issues to flow elements
    * Jira may be used for manual tasks
    * Automated tasks may be triggered by web hooks or polling
    * Automated tasks may also be stored in Jira and assigned to non-human users or use external ID to match tasks to executors
    * Issue hierarchies may be generated from flow definitions and linked to flow documentation.
* Maven or [Maven Resolver](https://maven.apache.org/resolver/index.html) may be used to implement loading of executors from Maven repositories - action definitions for automated tasks would contain Maven coordinates, repository connectivity parameters such as URL and credentials, Action implementation class name, and configuration. Action executor would download required artifacts, create a classloader and execute the Action class. See https://github.com/yahro/maven-classloader/blob/master/src/main/java/com/bigfatgun/MavenClassLoader.java for an old example of creating a classloader from Maven coordinates.     
           
## Visualizations

In addition to manually created and then auto-instrumented Drawio diagrams the following visualizations may be used with flows:

* [ECharts](https://echarts.apache.org/examples/en/index.html)
    * [Graph](https://echarts.apache.org/examples/en/index.html#chart-type-graph) to visualize relationships between activities. 
    * [Tree](https://echarts.apache.org/examples/en/index.html#chart-type-tree) to visualize activity hierarchy - Work Breakdown Structure
    * [Sunburst](https://echarts.apache.org/examples/en/index.html#chart-type-sunburst) and [https://echarts.apache.org/examples/en/index.html#chart-type-treemap] to visualize distribution of in-flight "tasks" and their statuses. E.g. 200 flows are in "Analysis" activity, and 100 are in "Development"
    * [ThemeRiver](https://echarts.apache.org/examples/en/index.html#chart-type-themeRiver) and [Bar](https://echarts.apache.org/examples/en/index.html#chart-type-bar) to visualize distribution of in-flight tasks and their statuses. E.g. 70 flows are in "Anlysis" with "Green" status, 20 with "Amber" and 10 with "Red".
    * [3D Bar](https://echarts.apache.org/examples/en/index.html#chart-type-bar3D) can be used as the above with time dimension - showing how tasks progress through the flow over time.
* [PlantUML](https://plantuml.com/) and [Mermaid](https://mermaid.js.org/intro/) can be used to generate flow visualizations. This approach may save time for small flows, but generated visualization might be difficult to comprehend in case of flows with a large number of elements.

## Use Cases

### Documentation

The model can be used to generate process documentation with cross-referencing of model elements. E.g. listing all actions where a resource (tool) is used a participant plays a role (has responsibility). 
Without use of inheritance and mix-ins this approach allows to have versioned process documentation which can be branched and forked. I.e. developed as code via a number of iterations.

Inheritance and mix-ins allow to create a continuum[^1]/tree of flow definitions with adaptations for different contexts similar to how Docker images are created from other images:

* A vendor may create flows explaining how to use their product
* The vendor may also create mix-ins for different integrations and implementation options 
* A central function in an enterprise may create generic flows explaining how to to use a vendor product in the context of the organization. The central function may also create mix-ins for different options which lower levels of the organization may choose from. 
* Org. units may further specialize flow definitions

[^1]: See [TOGAF Enterprise Continuum](https://pubs.opengroup.org/togaf-standard/introduction/chap03.html#tag_03_10)

### Execution Governance

A flow may reflect a long-running transformation process, e.g. a technology upgrade. There might be multiple instances of the flow executed by multiple teams. 
Individual work items would reside in backlogs of those teams. Some teams may use, say, Jira, while other may use some other tracking mechanism. 
An extraction process would collect work items status and create a consolidated report for that particular flow. 

Report options:

* Create report pages for multiple levels in the organization with roll-up. For each level it would show distribution of instances by actions/stages and statuses. Diferent representations - tabular, charts, diagrams (see below). See the "Visualizations" section above for more details.
* For each page display the flow's Drawio diagram with injected statistics - number of flows at a particular stage, status. 

