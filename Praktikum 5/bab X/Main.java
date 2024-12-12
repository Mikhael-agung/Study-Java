import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

// Kelas Transaksi
class TransaksiBaru {
    private String tanggal;
    private float nominal;

    // Constructor
    public TransaksiBaru(String tanggal, float nominal) {
        this.tanggal = tanggal;
        this.nominal = nominal;
    }

    // Overriding toString() untuk menampilkan data sebagai teks
    @Override
    public String toString() {
        return "Tanggal: " + tanggal + " , Nominal: " + nominal;
    }
}

// Kelas utama
public class Main {
    public static void main(String[] args) {
        // Membuat ArrayList berisi objek Transaksi
        ArrayList<TransaksiBaru> daftarTransaksi = new ArrayList<>();
        daftarTransaksi.add(new TransaksiBaru("2024-12-01", 50000.0f));
        daftarTransaksi.add(new TransaksiBaru("2024-12-02", 150000.0f));
        daftarTransaksi.add(new TransaksiBaru("2024-12-03", 75000.0f));
        daftarTransaksi.add(new TransaksiBaru("2024-12-04", 200000.0f));
        daftarTransaksi.add(new TransaksiBaru("2024-12-05", 100000.0f));

        // Memanggil method exportToTxt
        exportToTxt("transaksi.txt", daftarTransaksi);
    }

    // Method exportToTxt
    public static void exportToTxt(String fileName, ArrayList<TransaksiBaru> daftarTransaksi) {
        try (FileWriter writer = new FileWriter(fileName)) {
            // Menulis setiap elemen dari ArrayList ke dalam file
            for (TransaksiBaru transaksi : daftarTransaksi) {
                writer.write(transaksi.toString() + "\n");
            }
            System.out.println("Data berhasil diekspor ke file: " + fileName);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menulis ke file: " + e.getMessage());
        }
    }
}
