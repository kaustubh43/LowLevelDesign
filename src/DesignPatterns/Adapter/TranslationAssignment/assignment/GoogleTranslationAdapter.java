package DesignPatterns.Adapter.TranslationAssignment.assignment;

import DesignPatterns.Adapter.TranslationAssignment.assignment.externals.GoogleTranslateApi;
import DesignPatterns.Adapter.TranslationAssignment.assignment.externals.GoogleTranslationRequest;

import java.util.List;

public class GoogleTranslationAdapter implements TranslationProviderAdapter{
    GoogleTranslateApi googleTranslateApi;

    public GoogleTranslationAdapter() {
        this.googleTranslateApi = new GoogleTranslateApi();
    }

    @Override
    public List<String> getLanguages() {
        return googleTranslateApi.getLanguages();
    }

    @Override
    public String translate(TranslationRequest request) {
        GoogleTranslationRequest customGoogleRequest = new GoogleTranslationRequest(request.text, request.sourceLanguage, request.targetLanguage, 0.8);
        return googleTranslateApi.convert(customGoogleRequest);
    }

}
