Using xtext: 

1) in Eclipse, create a new xtext project and in it a file <name>.xtext with an attributed grammar
2) implement a corresponding generator using xtend 
(e.g. MyDslGenerator.xtend in folder <project name>.generator)
2) green arrow -> Generate language Infrastructure
3) green arrow  "Launch Runtime Eclipse" (or "Eclipse Application")
4) this starts a new Eclipse instance (adapted to the new dsl)
5) in the new Eclipse instance: create a Java project with a file <name>.mydsl and fill it with
a DSL model (syntax highlighting and code completion work for your dsl)
6) when saving that model, Eclipse (with the help of ANTLR) generates 
a corresponding syntax tree and applies your generator to it

Herbert Kuchen    12.11.2013
