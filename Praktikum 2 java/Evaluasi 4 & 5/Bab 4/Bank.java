import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bank {

    private Queue<String> antrianBiasa = new LinkedList<>();
    private LinkedList<String> antrianVIP = new LinkedList<>();

    public void tambahPelanggan(String namaPelanggan) {
        antrianBiasa.offer(namaPelanggan);
        System.out.println(namaPelanggan + " ditambahkan ke antrian sebagai pelanggan biasa.");
    }

    public void tambahPelangganVIP(String namaPelangganVIP, int posisi) {
        if (posisi < 1 || posisi > antrianVIP.size() + 1) {
            System.out.println("Posisi tidak valid. Pelanggan VIP tidak dapat ditambahkan.");
        } else {
            antrianVIP.add(posisi - 1, namaPelangganVIP); // Kurangi 1 untuk indeks
            System.out.println(namaPelangganVIP + " ditambahkan ke posisi " + posisi + " sebagai pelanggan VIP.");
        }
    }

    public void layaniPelanggan() {
        if (!antrianVIP.isEmpty()) {
            String pelangganDilayani = antrianVIP.poll();
            System.out.println(pelangganDilayani + " sedang dilayani sebagai pelanggan VIP.");
        } else if (!antrianBiasa.isEmpty()) {
            String pelangganDilayani = antrianBiasa.poll();
            System.out.println(pelangganDilayani + " sedang dilayani sebagai pelanggan biasa.");
        } else {
            System.out.println("Antrian kosong, tidak ada pelanggan yang dilayani.");
        }
    }

    public void tampilkanAntrian() {
        System.out.println("Antrian Pelanggan Biasa: " + antrianBiasa);
        System.out.println("Antrian Pelanggan VIP: " + antrianVIP);
    }

    public static void main(String[] args) {
        Bank bankAntrian = new Bank();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nPilih opsi:");
            System.out.println("1. Tambah pelanggan biasa");
            System.out.println("2. Tambah pelanggan VIP");
            System.out.println("3. Layani pelanggan berikutnya");
            System.out.println("4. Tampilkan antrian");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            switch (pilihan) {
                case 1 -> {
                    System.out.print("Masukkan nama pelanggan: ");
                    String namaPelanggan = scanner.nextLine();
                    bankAntrian.tambahPelanggan(namaPelanggan);
                }

                case 2 -> {
                    System.out.print("Masukkan nama pelanggan VIP: ");
                    String namaPelangganVIP = scanner.nextLine();
                    System.out.print("Masukkan posisi antrian (mulai dari 1): ");
                    int posisi = scanner.nextInt();
                    scanner.nextLine(); // Konsumsi newline
                    bankAntrian.tambahPelangganVIP(namaPelangganVIP, posisi);
                }

                case 3 -> bankAntrian.layaniPelanggan();

                case 4 -> bankAntrian.tampilkanAntrian();

                case 5 -> System.out.println("Keluar...");

                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);

        scanner.close();
    }
}
