package pattern.singleton;

public class Tab {
    private Setting setting = Setting.getInstance();

    public Setting getSetting(){
        return setting;
    }

}
