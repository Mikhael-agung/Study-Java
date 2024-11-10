
import jenisPegawai.KaryawanAdministrasi;
import jenisPegawai.KaryawanProduksi;

public class mainKaryawan_07651 {
    public static void main(String[] args) {
        KaryawanAdministrasi admin = new KaryawanAdministrasi("A", 101, 5000.0, "ADMIN");
        System.out.println("Informasi Karyawan Saat ini");
        admin.tampilkanInfoKaryawan();


        KaryawanProduksi produksi = new KaryawanProduksi("B", 101, 5000.0, "Malam");
        System.out.println("Informasi Karyawan Saat ini");
        produksi.tampilkanInfoKaryawan();
    }
}
