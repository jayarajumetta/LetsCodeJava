/**
 * 
 */
package mj.javaProgrammes;

/**
 * @author jayarajumetta
 * 
 *
 */
public class FirstGitProgramme {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		 Print Hello World
		 Simple Hello World Application.
		 */
		
		// Display Hello World
		
			System.out.println("Hello World ");
		
		/*Display Documented Concepts in console */
		
			//JavaConceptsDocumentation.javaConcepts();
		
		//Instance of a Bicycle -Object Creation
		
		BicycleDemo cycle1=new BicycleDemo();
			
			//print the state before we change it
			
			cycle1.printState();
		
		//Change the Bicycle state and create an instance of it
			
		BicycleDemo cycle2=new BicycleDemo();
		
			//Change the Bicycle status through cycle2 Object(Second Instance of a BicycleDemo)
		
			cycle2.changeCadence(5);
			cycle2.changeGear(6);
			cycle2.applyBreaks(3);
			cycle2.speedUp(8);
			cycle2.printState();
			//Working with Strings in Java

			ActionsOnStrings ObjString= new ActionsOnStrings();
			ObjString.StringMethods();
		
	}

}
