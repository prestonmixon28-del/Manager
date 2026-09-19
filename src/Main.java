public class Main {

    public static void main(String[] args) {

        AudioSystem audio = new AudioSystem();
        GraphicsRenderer graphics = new GraphicsRenderer();

        audio.playSound();
        graphics.render();

        System.out.println("--changing settings --");

        audio.changeVolume(80);
        graphics.changeResolution("2560x1440")

        System.out.println("-- checking updated settings --");

        audio.playSound();
        graphics.render();

    }
}
