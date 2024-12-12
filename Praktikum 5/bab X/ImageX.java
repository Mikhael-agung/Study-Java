import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class PersergiPanjangPanel extends JPanel {
    private BufferedImage image;

    public PersergiPanjangPanel() {
        // Membuat BufferedImage dengan ukuran 400x300
        image = new BufferedImage(400, 300, BufferedImage.TYPE_INT_ARGB);
        
        // Menggambar persegi panjang pada BufferedImage
        Graphics2D g2d = image.createGraphics();
        g2d.setColor(Color.BLUE);  // Warna persegi panjang
        g2d.fillRect(50, 50, 300, 200);  // Posisi dan ukuran persegi panjang
        g2d.dispose();  // Membersihkan objek Graphics
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, null);  // Menampilkan BufferedImage pada panel
    }

    // Menyimpan gambar ke file
    public void simpanGambar(String fileName) throws InterruptedException {
        try {
            ImageIO.write(image, "PNG", new File(fileName));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class ImageX {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Gambar Persegi Panjang");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        PersergiPanjangPanel panel = new PersergiPanjangPanel();
        frame.add(panel);

        frame.setVisible(true); 

        try {
            panel.simpanGambar("PersegiPanjang.png");  // Menyimpan gambar sebagai file PNG
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
