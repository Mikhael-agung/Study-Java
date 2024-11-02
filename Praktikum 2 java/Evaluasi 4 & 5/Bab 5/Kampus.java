import java.util.ArrayList;
import java.util.List;

class Mahasiswa {
    private String nama;
    private String nim; 
    private List<MataKuliah> mataKuliahList;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
        this.mataKuliahList = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public void mendaftarMataKuliah(MataKuliah mataKuliah) {
        mataKuliah.tambahMahasiswa(this); 
        mataKuliahList.add(mataKuliah); 
    }

    public void tampilkanMataKuliah() {
        System.out.println("Mata Kuliah yang diambil oleh " + nama + ":");
        for (MataKuliah mk : mataKuliahList) {
            System.out.println("- " + mk.getNamaMataKuliah());
        }
    }
}

class MataKuliah {
    private String namaMataKuliah;
    private List<Mahasiswa> mahasiswaList; 

    public MataKuliah(String namaMataKuliah) {
        this.namaMataKuliah = namaMataKuliah;
        this.mahasiswaList = new ArrayList<>();
    }

    public String getNamaMataKuliah() {
        return namaMataKuliah;
    }

    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        if (!mahasiswaList.contains(mahasiswa)) {
            mahasiswaList.add(mahasiswa); 
        }
    }

    public void tampilkanMahasiswa() {
        System.out.println("Mahasiswa yang terdaftar di " + namaMataKuliah + ":");
        for (Mahasiswa mhs : mahasiswaList) {
            System.out.println("- " + mhs.getNama());
        }
    }
}

public class Kampus {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Alice", "101");
        Mahasiswa mhs2 = new Mahasiswa("Bob", "102");

        MataKuliah mk1 = new MataKuliah("Pemrograman Dasar");
        MataKuliah mk2 = new MataKuliah("Struktur Data");

        mhs1.mendaftarMataKuliah(mk1);
        mhs1.mendaftarMataKuliah(mk2);
        mhs2.mendaftarMataKuliah(mk1);

        mhs1.tampilkanMataKuliah();
        mhs2.tampilkanMataKuliah();

        mk1.tampilkanMahasiswa();
        mk2.tampilkanMahasiswa();
    }
}
