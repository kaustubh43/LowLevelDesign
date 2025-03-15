package DesignPatterns.Adapter.TranslationAssignment.assignment.externals;


import java.util.List;

public class MicrosoftTranslateApi {
    public String translate(String text, String sourceLanguage, String targetLanguage) {
        // Implementation for translating text using Microsoft Translator API
        return "Translated text: Microsoft Translate";
    }

    // Method to retrieve the list of supported languages from Microsoft Translator
    public List<String> getSupportedLanguages() {
        // Implementation for fetching supported languages from Microsoft Translator
        return List.of("hindi", "marathi", "kannada");
    }
}