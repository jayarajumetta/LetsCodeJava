package mj.javaProgrammes;
import java.util.Scanner;

/* 

Write a class class AlienLanguageTranslator that implements all the funcionality of the given
LanguageTranslator class. You will need to override all the methods given in the LanguageTranslator
interface.

*/

public class AlienLanguageTranslator implements LanguageTranslator

{   
	static String AlienLanguageOut = "";
	static String defaultLanguageOut = "";
    static String _input="";
    
    public static void main(String[] args) { 
    	
    	AlienLanguageTranslator AlienObj=new AlienLanguageTranslator();
    	System.out.println(AlienObj.fromDefaultLanguage(DEFAULT_TRANSLATION));
    	System.out.println(AlienObj.toDefaultLanguage(DEFAULT_TRANSLATION));
    }
	@Override
	public String fromDefaultLanguage(String languageTokens) {
		
		Scanner scanObj=new Scanner(System.in);
        System.out.println("Enter Your Input in English");
        _input=  scanObj.nextLine();
        
		for (char ch:_input.toCharArray())
        {
        	AlienLanguageOut+=(char)(ch+3);
        }
		return "Alien Language output for Your Input"+":"+AlienLanguageOut;
	}
	@Override
	public String toDefaultLanguage(String languageTokens) {
		Scanner scanObj=new Scanner(System.in);
        System.out.println("Enter Your Input in Alien language");
        _input=  scanObj.nextLine();
		for (char ch:_input.toCharArray())
        {
        	 defaultLanguageOut += (char)(ch-3);
        }
		return "Default Language output for Your Input"+":"+defaultLanguageOut;
	}
}


