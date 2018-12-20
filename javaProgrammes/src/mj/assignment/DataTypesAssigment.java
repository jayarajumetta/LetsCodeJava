package mj.assignment;


public class DataTypesAssigment 

{

	public static void main(String[] args) 
	
	{
		
/*
* Exercise:1
* Write a Java program to print “Hello World” on the screen.
*/
		
		System.out.println("Exercise:1"+"\n"+"Hello World"+'\n');
		
/*
* Exercise:2 
*  Write a Java program to print the following output:

			* ++++++
			
			* @@@@@@
			
			* ******
			
			* ######
*/

		
		// declare char Array
		
			char[]  printArray= {'+','@','*','#'};
			
			int count=0;
			
			//loop through all characters in printArray
			
			System.out.println("Exercise:2");
			while(count<=printArray.length-1)
			{
			//print the character at count position in char array six times
				
				for (int i=0;i<7;i++)
					{
						//print the char at count position in printArray
						System.out.print(printArray[count]);
						
					}
					System.out.println('\n');
					count++;
			}
/*
* Exercise:3 			
* Write a Java program to declare three variable  a, b, & c and store the values respectively 10, 20.3 & 3.14785 . Then display their values on the screen.
*/
			//declare a,b & c variables
				byte a;
				float b;
				double c;
				
			//Initialize the variables
				a=10;
				b=(float) 20.3;
				c=3.14785;
				System.out.println("Exercise:3"+"\n"+"a="+a+'\t'+"b="+b+'\t'+"c="+c+'\t'+"\n");
			
			
/*
 * Exercise:4 
 * Write a Java program to declare a Boolean variable with initial value of “true” and later change it to “false” before printing it.
*/				
					
				// Declare boolean variable
				boolean booleanVariable;
				
				//Initialize the boolean variable to false value
				booleanVariable=true;
				
				//assign true to booleanVariable 
				booleanVariable=false;
				
				//print the bo0leanvaribale value
				System.out.println("Exercise:4"+"\n"+booleanVariable);
				
	}
	
}
