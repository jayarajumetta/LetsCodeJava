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
		
		// TODO Auto-generated method stub
		//System.out.println("Hello World ");
		//JavaConceptsDocumentation.javaConcepts();
		
		//Instance of a Bicycle -Object Creation
		BicycleDemo cycle1=new BicycleDemo();
		cycle1.printState();
		
		//Change the Bicycle state and create an instance of it
		BicycleDemo cycle2=new BicycleDemo();
		cycle2.changeCadence(5);
		cycle2.changeGear(6);
		cycle2.applyBreaks(3);
		cycle2.speedUp(8);
		cycle2.printState();
		
		
	}

}
