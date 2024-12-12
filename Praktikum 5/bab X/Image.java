import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;



public class Image {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Gambar");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);

            ImageIcon icon = new ImageIcon("C:/Users/agung/Pictures/Screenshots/Cuplikan layar 2024-05-15 201856.png");

            JLabel label = new JLabel(icon);
            frame.getContentPane().add(label);


            frame.setVisible(true);
        });
    }    
}
