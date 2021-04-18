
public class A_Main {
    private G_World world = null;

    public A_Main() {
        G_Frame frame = new G_Frame();
        frame.setVisible(true);

        world = new G_World();
        world.setGraphicSystem(frame.getPanel());
        world.setInputSystem(frame.getPanel());
        world.init();
        world.run();
    }

    public static void main(String[] args) {
        new A_Main();
    }
}
