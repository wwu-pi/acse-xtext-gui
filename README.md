## Repository structure
This repository contains multiple Eclipse projects for a sample DSL to create GUIs.

Five DSL-related projects exist with the following important files:
* de.wwu.pi.guidsl: The main DSL project with the Xtext file.
  * `de.wwu.pi.guidsl.GenerateGuiDsl.mwe2` -> The workflow to generate the language artifacts (see below)
  * `de.wwu.pi.guidsl.generator.GuiDslGenerator.xtend` -> The generator that takes the models as input
  * `de.wwu.pi.guidsl.scoping` -> Scope providers for the model editor
  * `de.wwu.pi.guidsl.validation` -> Validators for the model editor
* de.wwu.pi.guidsl.ide: Complementary IDE project.
* de.wwu.pi.guidsl.tests: Unit tests for the DSL.
* de.wwu.pi.guidsl.ui(.tests): The editor project.

## Setup the example
1. Import these five projects into Eclipse (with installed Xtext and Xtend plugins, see [https://wwu-pi.github.io/tutorials/lectures/acse/](https://wwu-pi.github.io/tutorials/lectures/acse/) for tutorials on how to setup the environment).
1. Right-click the `de.unimuenster.pi.GenerateGuiDsl.mwe2` workflow and choose Run as > MWE Workflow.
1. Go to Run > Run configurations... and start a new Eclipse instance (“Launch Runtime Eclipse”).
1. In the newly opened Eclipse instance, import the project from the `de.wwu.pi.guidsl.models` project.
It contains an example file making use of the grammar.
1. If you make changes to the model an save it, the generator will automatically be triggered and generate a Java SWT application within the `src-gen` directory of the model project.
1. To run the generated application, make sure that in your model at least one window is declared to be the main one. In the build configuration of the .models project, make sure that the correct SWT jar file is selected according to your platform (jars are provided for Linux/macOS/Windows in the `/lib` directory). Then you can open the respective file an select Run > Run as > Java Application.
