package kendaraan;

public class kapal {
    protected String nama;
    protected String tipe;

    public kapal (String nama, String tipe){
        this.nama = nama;
        this.tipe = tipe;
    }

    public void tampilkanKapal() {
        System.out.println("Kapal");
        System.out.println("Nama Kapal : " + nama);
        System.out.println("Tipe Kapal : " + tipe);
        System.out.println("");
    }

    
}
