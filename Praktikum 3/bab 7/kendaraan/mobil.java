package kendaraan;

public class mobil{
    protected String nama;
    protected String jenis;

    public mobil(String nama, String jenis){
        this.nama = nama;
        this.jenis = jenis;
    }
    
    public void tampilkanDataMobil(){
        System.out.println("Mobil");
        System.out.println("Nama Mobil : " + nama);
        System.out.println("tipe Mobil : " + jenis);
        System.out.println("");
    }
}
