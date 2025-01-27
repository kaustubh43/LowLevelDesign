package DesignPatterns.Factory;

public abstract class Flutter {
    int refreshRate;

    public void setTheme(String theme){
        System.out.println("Them has been set to:" + theme);
    }

    public void setRefreshRate(int refreshRate) {
        this.refreshRate = refreshRate;
    }

    public abstract UiFactory createUiFactory();
}
