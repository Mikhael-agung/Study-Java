import java.util.Scanner;

public class DivisionWithExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Meminta pengguna memasukkan angka pertama
            System.out.print("Masukkan angka pertama: ");
            int angka1 = Integer.parseInt(scanner.nextLine());

            // Meminta pengguna memasukkan angka kedua
            System.out.print("Masukkan angka kedua: ");
            int angka2 = Integer.parseInt(scanner.nextLine());

            // Melakukan pembagian
            int hasil = angka1 / angka2;
            System.out.println("Hasil pembagian: " + hasil);

        } catch (NumberFormatException e) {
            // Menangani input yang tidak valid
            System.out.println("Error: Input harus berupa angka.");
        } catch (ArithmeticException e) {
            // Menangani pembagian dengan nol
            System.out.println("Error: Tidak dapat membagi dengan nol.");
        } finally {
            // Pesan yang selalu ditampilkan
            System.out.println("Operasi pembagian selesai.");
            scanner.close();
        }
    }
}
