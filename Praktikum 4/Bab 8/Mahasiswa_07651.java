
abstract class Mahasiswa {
    abstract String nama();
    abstract String NPM();
    abstract boolean isMhsAktif();

    void tampilkanMahasiswa() {
        System.out.println("Nama: " + nama());
        System.out.println("NPM: " + NPM());
        System.out.println("Status: " + (isMhsAktif() ? "Aktif" : "Tidak Aktif"));
    }
}

class Pagi extends Mahasiswa {
    private String nama;
    private String NPM;
    private boolean aktif;


    Pagi(String nama, String NPM, boolean aktif){
        this.nama = nama;
        this.NPM = NPM; 
        this.aktif = aktif;
    }

    @Override
    String nama() {
        return nama;
    }

    @Override
    String NPM() {
        return NPM;
    }

    @Override
    boolean isMhsAktif() {
        return aktif;
    }
}

class Malam extends Mahasiswa {
    private String nama;
    private String NPM;
    private boolean aktif;


    Malam(String nama, String NPM, boolean aktif){
        this.nama = nama;
        this.NPM = NPM; 
        this.aktif = aktif;
    }

    @Override
    String nama() {
        return nama;
    }

    @Override
    String NPM() {
        return NPM;
    }

    @Override
    boolean isMhsAktif() {
        return aktif;
    }
}


public class Mahasiswa_07651{
    public static void main(String[] args) {
        Mahasiswa mhsPagi = new Pagi("Budi", "12345", true);
        Mahasiswa mhsMalam = new Malam("Anggi", "12345", false);



        System.out.println("Mahasiswa pagi");
        mhsPagi.tampilkanMahasiswa();

        System.out.println("\n");

        System.out.println("Mahasiswa malam");
        mhsMalam.tampilkanMahasiswa();
    }
}
