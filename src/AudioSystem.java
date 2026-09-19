public class AudioSystem {

    public void playSound() {
        ConfigurationManager config = ConfigurationManager.getInstance();

        System.out.println("Playing sound at volume " + config.getVolume());
    }

    public void changeVolume(int volume) {
        ConfigurationManager config = ConfigurationManager.getInstance();

        config.setVolume(volume);
        System.out.println("volume changed to " + volume);
    }
    
}
