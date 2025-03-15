package DesignPatterns.Adapter.TranslationAssignment.assignment;


import java.util.List;

public interface TranslationProviderAdapter {
    List<String> getLanguages();

    String translate(TranslationRequest request);
}
