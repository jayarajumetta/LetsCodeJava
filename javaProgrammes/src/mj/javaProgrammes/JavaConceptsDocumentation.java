package mj.javaProgrammes;

public class JavaConceptsDocumentation {
		
	public static void javaConcepts() {
		
		System.out.println("Comments are ignored by the compiler but are useful to other programmers.\n The Java programming language supports three kinds of comments:\n" + 
				"\n" + 
				"/* text */\n" + 
				"The compiler ignores everything from /* to */.\n" + 
				"/** documentation */\n" + 
				"This indicates a documentation comment (doc comment, for short). The compiler ignores this kind of comment, just like it ignores comments that use /* and */. The javadoc tool uses doc comments when preparing automatically generated documentation. For more information on javadoc, see the Javadoc™ tool documentation .\n" + 
				"// text\n" + 
				"The compiler ignores everything from // to the end of the line.\n");
		
		System.out.println("the most basic form of a class definition is:\n" + 
				"\n" + 
				"class name {\n" + 
				"    . . .\n" + 
				"}\n" + 
				"The keyword class begins the class definition for a class named name, and the code for each class appears between the opening and closing curly braces marked in bold above");
		System.out.println("n the Java programming language, every application must contain a main method whose signature is:\n" + 
				"\n" + 
				"public static void main(String[] args)\n" + 
				"The modifiers public and static can be written in either order (public static or static public), but the convention is to use public static as shown above. You can name the argument anything you want, but most programmers choose \"args\" or \"argv\".\n" + 
				"\n" + 
				"The main method is similar to the main function in C and C++; it's the entry point for your application and will subsequently invoke all the other methods required by your program.\n" + 
				"\n" + 
				"The main method accepts a single argument: an array of elements of type String.\n" + 
				"\n" + 
				"public static void main(String[] args)\n" + 
				"This array is the mechanism through which the runtime system passes information to your application. For example:\n" + 
				"\n" + 
				"java MyApp arg1 arg2\n" + 
				"Each string in the array is called a command-line argument. Command-line arguments let users affect the operation of the application without recompiling it. For example, a sorting program might allow the user to specify that the data be sorted in descending order with this command-line argument:\n" + 
				"\n" + 
				"-descending");
		System.out.println("");
	}
	
	
	

}
