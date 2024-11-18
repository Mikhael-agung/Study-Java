package kendaraan;

public class pesawat {
    protected String nama;
    protected String jenis;

    public pesawat (String nama, String jenis){
        this.nama = nama;
        this.jenis = jenis;
    }

    public void tampilkanDataPesawat() {
        System.out.println("Mobil");
        System.out.println("Nama Mobil : " + nama);
        System.out.println("tipe Mobil : " + jenis);
        System.out.println("");
    }
}
