package DesignPatterns.Adapter.TranslationAssignment;

import DesignPatterns.Adapter.TranslationAssignment.assignment.GoogleTranslationAdapter;
import DesignPatterns.Adapter.TranslationAssignment.assignment.MicrosoftTranslationAdapter;
import DesignPatterns.Adapter.TranslationAssignment.assignment.TranslationProviderAdapter;
import DesignPatterns.Adapter.TranslationAssignment.assignment.TranslationRequest;

public class TranslationManager {
    public String translate(String text, String sourceLanguage, String targetLanguage, String provider) {
        TranslationRequest request = new TranslationRequest(text, sourceLanguage, targetLanguage);
        TranslationProviderAdapter translator;

        if(provider.equals("google")){
            translator = new GoogleTranslationAdapter();
        }
        else if (provider.equals("microsoft")) {
            translator = new MicrosoftTranslationAdapter();
        } else {
            throw new RuntimeException("Invalid provider");
        }
        return translator.translate(request);
    }
}
