package DesignPatterns.Adapter.TranslationAssignment.assignment.externals;

import java.util.List;

public class GoogleTranslateApi {

    public String convert(GoogleTranslationRequest request) {
        return "Translated text: Google Translate";
    }

    public List<String> getLanguages() {
        return List.of("hindi", "marathi", "kannada");
    }
}