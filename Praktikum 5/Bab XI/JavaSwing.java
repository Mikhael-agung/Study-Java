import javax.swing.*;

public class JavaSwing {
    JFrame frame = new JFrame();

    public void buatFrame() {
        frame.setSize(400, 600);
        frame.setTitle("Hallo Guys");
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        JavaSwing app = new JavaSwing();
        app.buatFrame();
    }
}
