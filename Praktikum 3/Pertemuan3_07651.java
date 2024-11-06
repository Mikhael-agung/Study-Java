// Class Paket (Super Class)
class Paket {
    protected String resi;
    protected double berat;
    protected String tujuan;

    public Paket(String resi, double berat, String tujuan) {
        this.resi = resi;
        this.berat = berat;
        this.tujuan = tujuan;
    }

    // Method untuk menampilkan informasi paket (akan di-override di sub-class)
    public void tampilkanInfoPaket() {
        System.out.println("Resi: " + resi);
        System.out.println("Berat: " + berat + " kg");
        System.out.println("Tujuan: " + tujuan);
    }
}

// Sub-class PaketDomestik
class PaketDomestik extends Paket {
    private String wilayah;
    private String opsiPengiriman;

    public PaketDomestik(String resi, double berat, String tujuan, String wilayah, String opsiPengiriman) {
        super(resi, berat, tujuan);
        this.wilayah = wilayah;
        this.opsiPengiriman = opsiPengiriman;
    }

    // Override method tampilkanInfoPaket
    @Override
    public void tampilkanInfoPaket() {
        super.tampilkanInfoPaket();
        System.out.println("Wilayah: " + wilayah);
        System.out.println("Opsi Pengiriman: " + opsiPengiriman);
    }
}

// Sub-class PaketInternasional
class PaketInternasional extends Paket {
    private String negara;
    private double biayaCukai;

    public PaketInternasional(String resi, double berat, String tujuan, String negara, double biayaCukai) {
        super(resi, berat, tujuan);
        this.negara = negara;
        this.biayaCukai = biayaCukai;
    }

    // Override method tampilkanInfoPaket
    @Override
    public void tampilkanInfoPaket() {
        super.tampilkanInfoPaket();
        System.out.println("Negara: " + negara);
        System.out.println("Biaya Cukai: " + biayaCukai);
    }
}

// Main Class untuk menjalankan program
public class Pertemuan3_07651 {
    public static void main(String[] args) {
        // Membuat objek PaketDomestik
        PaketDomestik paketDomestik = new PaketDomestik("RESI001", 2.5, "Jakarta", "Jawa", "Same Day");
        System.out.println("Informasi Paket Domestik:");
        paketDomestik.tampilkanInfoPaket();

        // Membuat objek PaketInternasional
        PaketInternasional paketInternasional = new PaketInternasional("RESI002", 5.0, "Tokyo", "Jepang", 250.0);
        System.out.println("\nInformasi Paket Internasional:");
        paketInternasional.tampilkanInfoPaket();
    }
}
