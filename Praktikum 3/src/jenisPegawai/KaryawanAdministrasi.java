package jenisPegawai;

import karyawan.karyawanUmum;

public class KaryawanAdministrasi extends karyawanUmum {
    private String departemen;


    public KaryawanAdministrasi (String nama, int id, double gaji, String departemen){
        super(nama, id, gaji);
        this.departemen = departemen;
    }

    @Override
    public void tampilkanInfoKaryawan() {
        super.tampilkanInfoKaryawan();
        System.out.println("Departemen : " + departemen);
    }
}
