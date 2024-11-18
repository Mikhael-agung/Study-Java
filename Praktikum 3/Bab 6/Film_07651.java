// Class induk: Film
class Film {
    // Atribut umum untuk semua jenis film
    protected String judul;
    protected String sutradara;
    protected int tahunRilis;

    public Film(String judul, String sutradara, int tahunRilis) {
        this.judul = judul;
        this.sutradara = sutradara;
        this.tahunRilis = tahunRilis;
    }

    public void tampilkanInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Sutradara: " + sutradara);
        System.out.println("Tahun Rilis: " + tahunRilis);
    }
}

// Class Anak: Animasi
class Animasi extends Film {

    private String studio;
    private String teknikAnimasi;

    public Animasi(String judul, String sutradara, int tahunRilis, String studio, String teknikAnimasi) {
        super(judul, sutradara, tahunRilis);
        this.studio = studio;
        this.teknikAnimasi = teknikAnimasi;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Studio: " + studio);
        System.out.println("Teknik Animasi: " + teknikAnimasi);
    }
}

class Dokumenter extends Film {
    private String topik;
    private String durasi;

    public Dokumenter(String judul, String sutradara, int tahunRilis, String topik, String durasi) {
        super(judul, sutradara, tahunRilis);
        this.topik = topik;
        this.durasi = durasi;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Topik: " + topik);
        System.out.println("Durasi: " + durasi);
    }
}

class Pendek extends Film {
    private int durasi;

    public Pendek(String judul, String sutradara, int tahunRilis, int durasi) {
        super(judul, sutradara, tahunRilis);
        this.durasi = durasi;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Durasi: " + durasi + " menit");
    }
}

public class Film_07651{
    public static void main(String[] args) {
        Animasi film1 = new Animasi("Up", "Pete Docter", 2009, "Pixar", "3D CGI");
        Dokumenter film2 = new Film("Our Planet", "David Attenborough", 2019, "Alam dan Lingkungan", "8 episode x 50 menit");
        Film film3 = new Pendek("The Neighbor's Window", "Marshall Curry", 2019, 20);

        System.out.println("Informasi Film Animasi:");
        film1.tampilkanInfo();
        System.out.println("\nInformasi Film Dokumenter:");
        film2.tampilkanInfo();
        System.out.println("\nInformasi Film Pendek:");
        film3.tampilkanInfo();
    }
}
