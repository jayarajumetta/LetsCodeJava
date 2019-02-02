package mj.javaProgrammes;

public interface LanguageTranslator {
	public String DEFAULT_TRANSLATION = "EN";
	
	// Translates the language from default language
	public String fromDefaultLanguage(String languageTokens);
	
	// Translates the language to default language
	public String toDefaultLanguage(String languageTokens);
}
