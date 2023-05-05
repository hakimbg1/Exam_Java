package m1.designpattern.singleton;

public class Main {
    public static void main(String[] args) {
        ConfigManager manager = ConfigManager.getInstance();
        manager.set("PORT_NUMBER", 5432);

        ConfigManager other = ConfigManager.getInstance();
        System.out.println(other.get("PORT_NUMBER"));
    }
}
