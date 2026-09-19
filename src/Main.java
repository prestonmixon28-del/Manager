public class Main {

    public static void main(String[] args) {

        ConfigurationManager config1 = ConfigurationManager.getInstance();
        ConfigurationManager config2 = ConfigurationManager.getInstance();
    
        System.out.println("same object " + (config1 == config2));

        System.out.println("Volume " + config1.getVolume());

        config1.setVolume(80);

        System.out.println("Voloume from config2 " + config2.getVolume());
        
    }
}
