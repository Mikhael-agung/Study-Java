import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class JTextField { // Nama kelas tetap JTextField
    public static void main(String[] args) {
        JFrame frame = new JFrame("Aplikasi Sederhana");
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Membuat JLabel
        JLabel label = new JLabel("Teks akan muncul di sini");
        label.setBounds(50, 50, 300, 30);
        frame.add(label);

        javax.swing.JTextField textField = new javax.swing.JTextField();
        textField.setBounds(50, 100, 300, 30);
        frame.add(textField);

        JButton button = new JButton("Tampilkan Teks");
        button.setBounds(150, 150, 120, 30);
        frame.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText = textField.getText();
                label.setText(inputText);
            }
        });

        frame.setVisible(true);
    }
}
