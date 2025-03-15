package DesignPatterns.Adapter.TranslationAssignment.assignment;

import DesignPatterns.Adapter.TranslationAssignment.assignment.externals.MicrosoftTranslateApi;

import java.util.List;

public class MicrosoftTranslationAdapter implements TranslationProviderAdapter {
    MicrosoftTranslateApi microsoftTranslateApi;

    public MicrosoftTranslationAdapter() {
        this.microsoftTranslateApi = new MicrosoftTranslateApi();
    }

    @Override
    public List<String> getLanguages() {
        return microsoftTranslateApi.getSupportedLanguages();
    }

    @Override
    public String translate(TranslationRequest request) {
        return microsoftTranslateApi.translate(request.text, request.sourceLanguage, request.targetLanguage);
    }
}
