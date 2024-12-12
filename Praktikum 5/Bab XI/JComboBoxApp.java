import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JComboBoxApp {
    public static void main(String[] args) {
        // Membuat JFrame
        JFrame frame = new JFrame("Color Changer");
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Membuat JLabel
        JLabel label = new JLabel("Choose Color:");
        label.setBounds(50, 50, 100, 30);
        frame.add(label);

        // Membuat JComboBox untuk pilihan warna
        String[] colors = {"Red", "Green", "Blue", "Yellow", "Cyan"};
        JComboBox<String> colorBox = new JComboBox<String>(colors);
        colorBox.setBounds(150, 50, 150, 30);
        frame.add(colorBox);

        // Menambahkan aksi pada JComboBox
        colorBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedColor = (String) colorBox.getSelectedItem();
                switch (selectedColor) {
                    case "Red":
                        frame.getContentPane().setBackground(Color.RED);
                        break;
                    case "Green":
                        frame.getContentPane().setBackground(Color.GREEN);
                        break;
                    case "Blue":
                        frame.getContentPane().setBackground(Color.BLUE);
                        break;
                    case "Yellow":
                        frame.getContentPane().setBackground(Color.YELLOW);
                        break;
                    case "Cyan":
                        frame.getContentPane().setBackground(Color.CYAN);
                        break;
                }
            }
        });

        // Menampilkan JFrame
        frame.setVisible(true);
    }
}
