package jenisPegawai;

import karyawan.karyawanUmum;

public class KaryawanProduksi extends karyawanUmum {
    private String shiftKerja;

    public KaryawanProduksi(String nama, int id, double gaji, String shiftKerja){
        super(nama, id, gaji);
        this.shiftKerja = shiftKerja;
    }

    @Override
    public void tampilkanInfoKaryawan() {
        super.tampilkanInfoKaryawan();
        System.out.println("Shift Kerja : " + shiftKerja);
    }
}
