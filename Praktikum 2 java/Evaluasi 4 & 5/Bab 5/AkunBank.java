public class AkunBank {
   
    private String namaNasabah; 
    private String nomorRekening; 
    private double saldo; 

    
    public AkunBank(String namaNasabah, String nomorRekening, double saldo) {
        this.namaNasabah = namaNasabah;
        this.nomorRekening = nomorRekening;
        this.saldo = saldo;
    }

    
    public String getNamaNasabah() {
        return namaNasabah;
    }

   
    public void setNamaNasabah(String namaNasabah) {
        this.namaNasabah = namaNasabah;
    }

    
    public String getNomorRekening() {
        return nomorRekening;
    }

    public void setNomorRekening(String nomorRekening) {
        this.nomorRekening = nomorRekening;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void tampilkanInformasi() {
        System.out.println("Nama Nasabah: " + namaNasabah);
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Saldo: " + saldo);
    }

    public static void main(String[] args) {
        AkunBank akun = new AkunBank("Budi Santoso", "1234567890", 5000000.0);

        akun.tampilkanInformasi();

        akun.setNamaNasabah("Budi Setiawan");
        
        akun.setSaldo(6000000.0);

        System.out.println("\nSetelah perubahan:");
        akun.tampilkanInformasi();
    }
}
