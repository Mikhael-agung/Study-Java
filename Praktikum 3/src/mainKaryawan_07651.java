
// import jenisPegawai.*;

public class mainKaryawan_07651 {
    public static void main(String[] args) {
        jenisPegawai.KaryawanAdministrasi admin = new jenisPegawai.KaryawanAdministrasi("A", 101, 5000.0, "ADMIN");
        System.out.println("Informasi Karyawan Saat ini");
        admin.tampilkanInfoKaryawan();


        jenisPegawai.KaryawanProduksi produksi = new jenisPegawai.KaryawanProduksi("B", 101, 5000.0, "Malam");
        System.out.println("Informasi Karyawan Saat ini");
        produksi.tampilkanInfoKaryawan();
    }
}
