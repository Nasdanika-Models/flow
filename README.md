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
    
    
GitLab URIHandler, Maven resolver    
    



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

Ent cont

### Execution Governance

pull from Jira

### Mixed Automated/Manual execution

Git/GitLab Maven resolver