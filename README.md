# CS-4450ParserProject
## Description

Our parser project is intended to parse each character in the provided python file, using our own predefined grammar, and create a viewable parse tree that follows our rules and provides the right grouping.

Our Grammar includes:  
- if/elif/else blocks  
- Variable Definitions  
- while and for loops  
- Arithmetic Operators  
- Assignment Operators  
- Conditional Statements  
- Comments  

We also have completed Bonus #2, whose build requirements will be listed as well

The final deliverable will be viewable using a .jar file, and will automatically run the commands to generate and show the parse tree using ANTLR. 

## Team Members

Walker Brownfield

Caleb Sellinger

Brendan Young

Kevin Zeng

## How to build


### Requirements:
 1. Apache Maven 3.8.4
 2. JavaSE 17

### If changes were made to the src\main\antlr4\App.g4:
 1. Run "mvn generate-sources" from the repository's root directory
 2. Copy all files from target\generated-sources\antlr4\ to src\main\java\parser
 3. Add "package parser;" to the first line of the four java class files (This is due to being unable to figure how to import them from the generated-sources folder).
 4. Run "mvn package" from the repository's root directory
 5. parser-1.0.0-shaded.jar should be created in the target folder.

### If no changes were made to the src\main\antlr4\App.g4:
 1. Run "mvn package" from the repository's root directory
 2. parser-1.0.0-shaded.jar file should be created in the target folder.

    
## How to Run: 
### Requirements:
 1. Your computer needs to be able to run java code newer than Java 7.
 2. Be able to use the java command from command prompt.
 3. A copy of parser-1.0.0-shaded.jar after project has been built.

File is selected after program start
### To run without terminal:
  1. Double click on the file parser-1.0.0-shaded.jar
    

### To run with terminal:
  1. Open terminal in same directory as parser-1.0.0-shaded.jar
  2. Run the command "java -jar .\parser-1.0.0-shaded.jar"

## Video

![Animation-1](https://user-images.githubusercontent.com/54420175/146464583-34aeaed6-1b87-467b-ba2b-a107f6551687.gif)

