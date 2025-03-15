package DesignPatterns.Adapter.TranslationAssignment;

public class Main {
    public static void main(String[] args) {
        TranslationManager manager = new TranslationManager();
        System.out.println(manager.translate("dummyText",
                "sourceLang",
                "targetLang",
                "microsoft"));
    }
}
