import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// Kelas untuk Buku
class Buku {
    private String id;
    private String judul;
    private boolean tersedia;

    public Buku(String id, String judul) {
        this.id = id;
        this.judul = judul;
        this.tersedia = true;
    }

    public String getId() {
        return id;
    }

    public String getJudul() {
        return judul;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Judul: " + judul + ", Tersedia: " + tersedia;
    }
}

// Kelas untuk Anggota
class Anggota {
    private  String id;
    private String nama;

    public Anggota(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nama: " + nama;
    }
}

// Kelas untuk Sistem Perpustakaan
class Perpustakaan {
    private final  ArrayList<Buku> daftarBuku;
    private final HashMap<String, Anggota> daftarAnggota;
    private final Queue<String> antreanPeminjaman;

    public Perpustakaan() {
        daftarBuku = new ArrayList<>();
        daftarAnggota = new HashMap<>();
        antreanPeminjaman = new LinkedList<>();
    }

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
        System.out.println("Buku ditambahkan: " + buku);
    }

    public void tambahAnggota(Anggota anggota) {
        daftarAnggota.put(anggota.getId(), anggota);
        System.out.println("Anggota ditambahkan: " + anggota);
    }

    public void pinjamBuku(String idBuku, String idAnggota) {
        Buku buku = cariBukuById(idBuku);
        Anggota anggota = daftarAnggota.get(idAnggota);

        if (buku == null) {
            System.out.println("Buku tidak ditemukan!");
            return;
        }
        if (anggota == null) {
            System.out.println("Anggota tidak ditemukan!");
            return;
        }
        if (buku.isTersedia()) {
            buku.setTersedia(false);
            System.out.println("Buku dipinjam oleh: " + anggota.getNama());
        } else {
            antreanPeminjaman.add(idBuku);
            System.out.println("Buku sedang dipinjam. Ditambahkan ke antrean.");
        }
    }

    public void kembalikanBuku(String idBuku) {
        Buku buku = cariBukuById(idBuku);
        if (buku == null) {
            System.out.println("Buku tidak ditemukan!");
            return;
        }
        buku.setTersedia(true);
        System.out.println("Buku dikembalikan: " + buku.getJudul());

        if (!antreanPeminjaman.isEmpty() && antreanPeminjaman.peek().equals(idBuku)) {
            antreanPeminjaman.poll();
            System.out.println("Anggota berikutnya dalam antrean telah diberi tahu untuk buku: " + buku.getJudul());
        }
    }

    public void tampilkanBuku() {
        System.out.println("Daftar Buku di Perpustakaan:");
        for (Buku buku : daftarBuku) {
            System.out.println(buku);
        }
    }

    public void tampilkanAnggota() {
        System.out.println("Daftar Anggota Perpustakaan:");
        for (Anggota anggota : daftarAnggota.values()) {
            System.out.println(anggota);
        }
    }

    private Buku cariBukuById(String id) {
        for (Buku buku : daftarBuku) {
            if (buku.getId().equals(id)) {
                return buku;
            }
        }
        return null;
    }
}

// Kelas utama untuk menjalankan program
public class SistemPerpustakaan {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();
        try (Scanner scanner = new Scanner(System.in)) {
            // Data contoh
            perpustakaan.tambahBuku(new Buku("B1", "Pemrograman Java"));
            perpustakaan.tambahBuku(new Buku("B2", "Struktur Data"));
            perpustakaan.tambahAnggota(new Anggota("A1", "Vincent"));
            perpustakaan.tambahAnggota(new Anggota("A2", "Emily"));

            int pilihan;
            do {
                System.out.println("\nMenu Perpustakaan:");
                System.out.println("1. Tampilkan Buku");
                System.out.println("2. Tampilkan Anggota");
                System.out.println("3. Pinjam Buku");
                System.out.println("4. Kembalikan Buku");
                System.out.println("5. Keluar");
                System.out.print("Masukkan pilihan: ");
                pilihan = scanner.nextInt();
                scanner.nextLine(); // Konsumsi newline

                switch (pilihan) {
                    case 1 -> perpustakaan.tampilkanBuku();
                    case 2 -> perpustakaan.tampilkanAnggota();
                    case 3 -> {
                        System.out.print("Masukkan ID buku: ");
                        String idBuku = scanner.nextLine();
                        System.out.print("Masukkan ID anggota: ");
                        String idAnggota = scanner.nextLine();
                        perpustakaan.pinjamBuku(idBuku, idAnggota);
                    }
                    case 4 -> {
                        System.out.print("Masukkan ID buku: ");
                        String idBuku = scanner.nextLine();
                        perpustakaan.kembalikanBuku(idBuku);
                    }
                    case 5 -> System.out.println("Keluar...");
                    default -> System.out.println("Pilihan tidak valid!");
                }
            } while (pilihan != 5);
        }
    }
}
