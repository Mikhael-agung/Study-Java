package karyawan;

public class karyawanUmum {
    protected String nama;
    protected int id;
    protected double gaji;

    public karyawanUmum(String nama, int id, double gaji) {
        this.nama = nama;
        this.id = id;
        this.gaji = gaji;
    }

    public void tampilkanInfoKaryawan() {
        System.out.println("Nama: " + nama);
        System.out.println("ID: " + id);
        System.out.println("Gaji: " + gaji);
    }
}
