public class GraphicsRenderer {

    public void render() {
        ConfigurationManager config = ConfigurationManager.getInstance();

        System.out.println("rendering at resolution " + config.getResolution() + " in " + config.getDisplayMode() + " mode.");
    }

    public void changeResolution(String resolution) {
        ConfigurationManager config = ConfigurationManager.getInstance();

        config.setResolution(resolution);
        System.out.println("resolution chnaged to " + resolution);
    }
    
}
