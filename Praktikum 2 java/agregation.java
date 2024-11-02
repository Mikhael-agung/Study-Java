import java.util.ArrayList;
import java.util.List;

// Kelas Buku
class Buku {
    private String judul;
    private String penulis;

    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void displayInfo() {
        System.out.println("Judul: " + judul + ", Penulis: " + penulis);
    }
}

// Kelas Perpustakaan yang memiliki kumpulan buku
class Perpustakaan {
    private String nama;
    private List<Buku> koleksiBuku;

    public Perpustakaan(String nama) {
        this.nama = nama;
        this.koleksiBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        koleksiBuku.add(buku);
    }

    public void tampilkanKoleksi() {
        System.out.println("Koleksi buku di " + nama + ":");
        for (Buku buku : koleksiBuku) {
            buku.displayInfo();
        }
    }
}

// Main class untuk menjalankan program
public class agregation {
    public static void main(String[] args) {
        // Membuat beberapa objek Buku
        Buku buku1 = new Buku("Laskar Pelangi", "Andrea Hirata");
        Buku buku2 = new Buku("Bumi Manusia", "Pramoedya Ananta Toer");
        Buku buku3 = new Buku("Negeri 5 Menara", "A. Fuadi");

        // Membuat objek Perpustakaan
        Perpustakaan perpustakaan = new Perpustakaan("Perpustakaan Kota");

        // Menambahkan buku-buku ke dalam koleksi perpustakaan
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        perpustakaan.tambahBuku(buku3);

        // Menampilkan koleksi buku yang ada di perpustakaan
        perpustakaan.tampilkanKoleksi();
    }
}

