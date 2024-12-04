import java.util.Scanner;

public class DivisionWithExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
1
        try {
            System.out.print("Masukkan angka pertama: ");
            int angka1 = Integer.parseInt(scanner.nextLine());

            System.out.print("Masukkan angka kedua: ");
            int angka2 = Integer.parseInt(scanner.nextLine());

            int hasil = angka1 / angka2;
            System.out.println("Hasil pembagian: " + hasil);

        } catch (NumberFormatException e) {
            System.out.println("Error: Input harus berupa angka.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Tidak dapat membagi dengan nol.");
        } finally {
            System.out.println("Operasi pembagian selesai.");
            scanner.close();
        }
    }
}
