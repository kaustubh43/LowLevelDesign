package DesignPatterns.Adapter.TranslationAssignment.assignment;

public class TranslationRequest {
    String text;
    String sourceLanguage;
    String targetLanguage;

    public TranslationRequest(String text, String sourceLanguage, String targetLanguage) {
        this.text = text;
        this.sourceLanguage = sourceLanguage;
        this.targetLanguage = targetLanguage;
    }
}
