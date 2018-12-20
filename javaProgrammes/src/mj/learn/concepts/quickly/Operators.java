/**
 * 
 */
package mj.learn.concepts.quickly;

/**
 * @author jayarajumetta
 *
 */
public class Operators {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	
	{
		
		//Simple Assignment Operator
		int simpleAssignVariable;
		simpleAssignVariable=2;
		int multiAssignment=6;
		
		System.out.println("SimpleAssignVariable :"+simpleAssignVariable);
		System.out.println("MultiAssignment :"+multiAssignment);
		
		//Multiple Assignment
		
		simpleAssignVariable=multiAssignment=9;
		System.out.println("MultiAssignment :"+multiAssignment);
		System.out.println("SimpleAssignVariable :"+simpleAssignVariable+"\n");
		
		//Arithmetic operator

			double opperandNumbers=0;
			int firstNum=25,secondNum=6;
			
			//Addition
			opperandNumbers=firstNum+secondNum;
			System.out.println("Addition :"+opperandNumbers);
			//Subtraction
			opperandNumbers=firstNum-secondNum;
			System.out.println("Subtraction :"+opperandNumbers);
			//Multiplication
			opperandNumbers=firstNum*secondNum;
			System.out.println("Multiplication :"+opperandNumbers);
			//Division
			opperandNumbers=firstNum/secondNum;
			System.out.println("Division :"+opperandNumbers);
			//Modulo Division 
			opperandNumbers=firstNum%secondNum;
			System.out.println("Modulo Division :"+opperandNumbers);
			//Post Increment Operator
			System.out.println("Post Increment :"+opperandNumbers++);
			//Pre Increment operator
			System.out.println("Pre Increment :"+ ++opperandNumbers);
			//Post Decrement Operator
			System.out.println("Post Decrement :"+opperandNumbers--);
			//Pre Decrement operator
			System.out.println("Pre Decrement :"+ --opperandNumbers);
			
		//Relational Operators
			//Greater than
			System.out.println("Greater than :"+ (firstNum>secondNum));
			//Less than
			System.out.println("Less than :"+ (firstNum<secondNum));
			//Greater than or Equal to
			System.out.println("Greater than or Equal to :"+(firstNum>=secondNum));
			//Less than or Equal to
			System.out.println("Less than or Equal to :"+(firstNum<=secondNum));
			//Equal
			System.out.println("Equal :"+(firstNum==secondNum))	;
			//Not Equal to
			System.out.println("Not Equal to :"+(firstNum!=secondNum));
			
		//Conditional operator
			System.out.println("Conditional :"+((firstNum<secondNum)?"Greater":"less than"));
			
		//Logical Operators
			//And
			boolean a=true;
			boolean b=true;
			
			if( a &&  b)
			{
				System.out.println("Logical And operation :"+"returned True");	
			}
			else 
			{
				System.out.println("Logical And operation :"+"returned False");	
			}
			
			//And
			 a=true;
			 b=false;
			
			if( a &&  b)
			{
				System.out.println("Logical And operation :"+"returned True");	
			}
			else 
			{
				System.out.println("Logical And operation :"+"returned False");	
			}
			
			//OR
			 a=true;
			 b=false;
			
			if( a &&  b)
			{
				System.out.println("Logical OR operation :"+"returned True");	
			}
			else 
			{
				System.out.println("Logical OR operation :"+"returned False");	
			}
			
			//OR
			 a=false;
			 b=false;
			
			if( a &&  b)
			{
				System.out.println("Logical OR operation :"+"returned True");	
			}
			else 
			{
				System.out.println("Logical OR operation :"+"returned False");	
			}
			
			//Not Operator
			System.out.println("Previous value 'a' : "+ a +" ; after not applied 'a' value :"+ !a);
			 a=true;
			 b=false;
			
			if( a &&  !b)
			{
				System.out.println("Logical Not operation :"+"returned True");	
			}
			else 
			{
				System.out.println("Logical Not operation :"+"returned False");	
			}
			
			
	}

}
