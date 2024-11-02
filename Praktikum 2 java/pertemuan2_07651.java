import java.util.ArrayList;

// SOALL NOMOR 3

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

public class pertemuan2_07651 {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Pegawai("Rimuru");
        Pegawai pegawai2 = new Pegawai("Ainz");
        Pegawai pegawai3 = new Pegawai("Saitama");
        Pegawai pegawai4 = new Pegawai("Gon");
        Pegawai pegawai5 = new Pegawai("Asta");
        Pegawai pegawai6 = new Pegawai("Mikhael Agung"); 

        ArrayList<Pegawai> listPegawai = new ArrayList<>();
        listPegawai.add(pegawai1);
        listPegawai.add(pegawai2);
        listPegawai.add(pegawai3);
        listPegawai.add(pegawai4);
        listPegawai.add(pegawai5);
        listPegawai.add(pegawai6);

        for (Pegawai pegawai : listPegawai) {
            System.out.println("Nama Pegawai: " + pegawai.getNama());
        }
    }
}
