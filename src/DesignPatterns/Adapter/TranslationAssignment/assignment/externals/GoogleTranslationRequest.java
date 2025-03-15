package DesignPatterns.Adapter.TranslationAssignment.assignment.externals;

public class GoogleTranslationRequest {
    private String text;
    private String sourceLanguage;
    private String targetLanguage;
    private Double confidenceThreshold;

    public GoogleTranslationRequest(String text, String sourceLanguage, String targetLanguage, Double confidenceThreshold) {
        this.text = text;
        this.sourceLanguage = sourceLanguage;
        this.targetLanguage = targetLanguage;
        this.confidenceThreshold = confidenceThreshold;
    }
}
