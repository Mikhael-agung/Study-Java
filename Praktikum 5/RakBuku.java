import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class RakBuku {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Book Selector");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel labelTitle = new JLabel("Pilih Buku:");
        labelTitle.setBounds(50, 50, 100, 30);
        frame.add(labelTitle);

        String[] books = {"Buku 1: Petualangan Budiono", "Buku 2: One Piece", "Buku 3: Kisah Hidupku"};
        JComboBox<String> bookComboBox = new JComboBox<>(books);
        bookComboBox.setBounds(150, 50, 200, 30);
        frame.add(bookComboBox);

        JLabel labelSynopsis = new JLabel("Sinopsis akan ditampilkan di sini.");
        labelSynopsis.setBounds(50, 100, 300, 100);
        labelSynopsis.setVerticalAlignment(SwingConstants.TOP);
        frame.add(labelSynopsis);

        bookComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedBook = (String) bookComboBox.getSelectedItem();
                switch (selectedBook) {
                    case "Buku 1: Petualangan Budiono":
                        labelSynopsis.setText("Petualangan Budiono bercerita tentang seorang anak yang menjelajahi lautan untuk menjadi kapten kapal laut.");
                        break;
                    case "Buku 2: One Piece":
                        labelSynopsis.setText("One Piece adalah kisah bajak laut yang mencari harta karun legendaris.");
                        break;
                    case "Buku 3: Kisah Hidupku":
                        labelSynopsis.setText("Kisah Hidupku adalah autobiografi yang penuh inspirasi.");
                        break;
                }
            }
        });

        // Menampilkan JFrame
        frame.setVisible(true);
    }
}
