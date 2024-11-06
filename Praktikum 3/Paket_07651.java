// Class Paket (Super Class)
class Paket {
    protected String resi;
    protected double berat;
    protected String tujuan;
    private static final double TARIF_DASAR = 5000.0; // Tarif dasar per kg

    public Paket(String resi, double berat, String tujuan) {
        this.resi = resi;
        this.berat = berat;
        this.tujuan = tujuan;
    }

    // Method untuk menghitung biaya pengiriman berdasarkan berat dan tarif dasar
    public double hitungBiayaPengiriman() {
        return berat * TARIF_DASAR;
    }

    // Overload method hitungBiayaPengiriman dengan tambahan parameter biaya asuransi
    public double hitungBiayaPengiriman(double biayaAsuransi) {
        return (berat * TARIF_DASAR) + biayaAsuransi;
    }

    // Overload method hitungBiayaPengiriman dengan tambahan parameter potongan ongkos kirim
    public double hitungBiayaPengiriman(double biayaAsuransi, double potongan) {
        return (berat * TARIF_DASAR) + biayaAsuransi - potongan;
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

    @Override
    public void tampilkanInfoPaket() {
        super.tampilkanInfoPaket();
        System.out.println("Negara: " + negara);
        System.out.println("Biaya Cukai: " + biayaCukai);
    }

    @Override
    public double hitungBiayaPengiriman() {
        return super.hitungBiayaPengiriman() + biayaCukai;
    }
}

// Main Class untuk menjalankan program
public class Paket_07651 {
    public static void main(String[] args) {
        // Membuat objek PaketDomestik
        PaketDomestik paketDomestik = new PaketDomestik("RESI001", 2.5, "Jakarta", "Jawa", "Same Day");
        System.out.println("Informasi Paket Domestik:");
        paketDomestik.tampilkanInfoPaket();
        System.out.println("Biaya Pengiriman (tanpa asuransi atau potongan): " + paketDomestik.hitungBiayaPengiriman());
        System.out.println("Biaya Pengiriman (dengan asuransi 5000): " + paketDomestik.hitungBiayaPengiriman(5000));
        System.out.println("Biaya Pengiriman (dengan asuransi 5000 dan potongan 2000): " + paketDomestik.hitungBiayaPengiriman(5000, 2000));

        // Membuat objek PaketInternasional
        PaketInternasional paketInternasional = new PaketInternasional("RESI002", 5.0, "Tokyo", "Jepang", 250.0);
        System.out.println("\nInformasi Paket Internasional:");
        paketInternasional.tampilkanInfoPaket();
        System.out.println("Biaya Pengiriman (termasuk biaya cukai): " + paketInternasional.hitungBiayaPengiriman());
        System.out.println("Biaya Pengiriman (dengan asuransi 10000 dan potongan 5000): " + paketInternasional.hitungBiayaPengiriman(10000, 5000));
    }
}

