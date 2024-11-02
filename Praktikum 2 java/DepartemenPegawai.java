import java.util.ArrayList;


//SOAL NOMOR 4
class Pegawai {
    private String nama;

    public Pegawai(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}

class Departemen {
    private String namaDepartemen;
    private ArrayList<Pegawai> daftarPegawai;

    public Departemen(String namaDepartemen) {
        this.namaDepartemen = namaDepartemen;
        this.daftarPegawai = new ArrayList<>(); 
    }

    public void tambahPegawai(Pegawai pegawai) {
        daftarPegawai.add(pegawai);
        System.out.println("Pegawai " + pegawai.getNama() + " berhasil ditambahkan ke Departemen " + namaDepartemen);
    }

    public void cetakDaftarPegawai() {
        System.out.println("Daftar Pegawai di Departemen " + namaDepartemen + ":");
        for (Pegawai pegawai : daftarPegawai) {
            System.out.println("- " + pegawai.getNama());
        }
    }
}

public class DepartemenPegawai {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Pegawai("Rimuru");
        Pegawai pegawai2 = new Pegawai("Ainz");
        Pegawai pegawai3 = new Pegawai("Saitama");
        Pegawai pegawai4 = new Pegawai("Gon");
        Pegawai pegawai5 = new Pegawai("Asta");
        Pegawai pegawai6 = new Pegawai("Mikhael agung"); 

        Departemen departemen1 = new Departemen("Teknologi Informasi");

        departemen1.tambahPegawai(pegawai1);
        departemen1.tambahPegawai(pegawai2);
        departemen1.tambahPegawai(pegawai3);
        departemen1.tambahPegawai(pegawai4);
        departemen1.tambahPegawai(pegawai5);
        departemen1.tambahPegawai(pegawai6);

        departemen1.cetakDaftarPegawai();
    }
}
