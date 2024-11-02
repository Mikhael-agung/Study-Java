import java.util.Scanner; 

public class Transaksi {
    String tanggal;
    float nominal;

   
    public Transaksi(String tanggal, float nominal) {
        this.tanggal = tanggal;
        this.nominal = nominal;
    }

    
    public void tampilkanInfo() {
        System.out.println("Tanggal: " + this.tanggal);
        System.out.println("Nominal: " + this.nominal);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Transaksi[] transaksiArray = new Transaksi[3]; 

        
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan data transaksi ke-" + (i + 1));

            System.out.print("Tanggal (dd-mm-yyyy): ");
            String tanggal = input.nextLine();

            float nominal;
            while (true) {
                System.out.print("Nominal: ");
                nominal = input.nextFloat();
                input.nextLine();  

                
                if (nominal % 50000 == 0) {
                    break; 
                } else {
                    System.out.println("Nominal harus kelipatan 50.000!");
                }
            }

            transaksiArray[i] = new Transaksi(tanggal, nominal);
        }

        System.out.println("\nDaftar Transaksi:");
        for (Transaksi transaksi : transaksiArray) {
            transaksi.tampilkanInfo();
            System.out.println("----------------------------");
        }

        input.close(); 
    }
}
