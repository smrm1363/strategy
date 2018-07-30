# strategy
 I have used Strategy and Factory design pattern. In this simple program I separate the logic of each type of contracts, because they are different strategies. 
 I also have make a property file which contains the names of each type of files as keys of property, and the values of the property is Class path for concrete class of each strategy. If you want to add new strategy you do not need to change your code, just write new Class for the new strategy and put it on the property file.
  For running this program in command line, it ask you to enter the type of contract.  Just run the program via “java –jar“ command.
