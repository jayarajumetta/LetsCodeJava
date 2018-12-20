/**
 * 
 */
package mj.javaProgrammes;

/**
 * @author jayarajumetta
 *
 */

// Working with Strings in Java

public class ActionsOnStrings {
	
	String Name="      Jayaraju Metta            ";
	
	char[] Oname= {'J','A','Y','A','R','A','J','U'};
	String Ostring= new String(Oname);
	String NewString=new String("MJ");
	
	
public void	StringMethods() {
	
	System.out.println(Name);
	System.out.println(Oname);
	System.out.println(Ostring);
	System.out.println(NewString);
	
	//Character at Specific Index
	System.out.println(Name.charAt(8));
	
	//Concatenates the specified string at the end of the string 
	System.out.println(Name.concat(" "+NewString));
	
	//returns the length of the String
	System.out.println(Name.length());
	
	//Retruns the remaining part of the string
	System.out.println(Name.substring(4));
	
	// returns the part of string
	System.out.println(Name.substring(2, 4));
	
	System.out.println(Name.trim());
	System.out.println(Name.isBlank());
	System.out.println(Name.isEmpty());
	System.out.println(Name.toUpperCase());
	System.out.println(Name.toLowerCase());
	System.out.println(Name.intern());		
	System.out.println(Name.indexOf("JU"));

}


private char[] trim(String string) {
	// TODO Auto-generated method stub
	return null;
}

}
