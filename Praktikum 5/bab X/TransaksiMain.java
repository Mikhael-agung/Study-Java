import java.util.ArrayList;

class Transaksi {
    private  String tanggal;
    private  float nominal;

    public Transaksi(String tanggal, float nominal) {
        this.tanggal = tanggal;
        this.nominal = nominal;
    }

    public String getTanggal() {
        return tanggal;
    }

    public float getNominal() {
        return nominal;
    }

    @Override
    public String toString() {
        return "Tanggal: " + tanggal + ", Nominal: " + nominal;
    }
}

public class TransaksiMain {
    public static void main(String[] args) {
        // Membuat ArrayList untuk menyimpan objek Transaksi
        ArrayList<Transaksi> daftarTransaksi = new ArrayList<>();

        // Menambahkan 5 objek Transaksi ke dalam ArrayList
        daftarTransaksi.add(new Transaksi("2024-12-01", 50000));
        daftarTransaksi.add(new Transaksi("2024-12-02", 150000));
        daftarTransaksi.add(new Transaksi("2024-12-03", 75000));
        daftarTransaksi.add(new Transaksi("2024-12-04", 200000));
        daftarTransaksi.add(new Transaksi("2024-12-05", 100000));

        // Menampilkan daftar transaksi
        System.out.println("Daftar Transaksi:");
        for (Transaksi transaksi : daftarTransaksi) {
            System.out.println(transaksi);
        }
    }
}
