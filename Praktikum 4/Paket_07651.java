interface Pembayaran {
    void prosesPembayaran(double jumlah);
}

class PembayaranTunai implements Pembayaran {
    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("Pembayaran Tunai sebesar: " + jumlah);
    }
}

class PembayaranKartu implements Pembayaran {
    String nomorkartu;
    String namapemilik;

    PembayaranKartu(String nomorkartu, String namapemilik) {
        this.nomorkartu = nomorkartu;
        this.namapemilik = namapemilik;
    }

    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("Pembayaran Kartu sebesar: " + jumlah);
        System.out.println("Nomor Kartu: " + nomorkartu);
        System.out.println("Nama Pemilik: " + namapemilik);
    }
}

abstract class Paket {
    String namaPaket;

    Paket(String namaPaket) {
        this.namaPaket = namaPaket;
    }

    abstract void bayar(Pembayaran pembayaran, double jumlah);
}

class PaketDomestik extends Paket {
    PaketDomestik(String namaPaket) {
        super(namaPaket);
    }

    @Override
    void bayar(Pembayaran pembayaran, double jumlah) {
        System.out.println("Pembayaran untuk Paket Domestik: " + namaPaket);
        pembayaran.prosesPembayaran(jumlah);
    }
}

class PaketInternasional extends Paket {
    PaketInternasional(String namaPaket) {
        super(namaPaket);
    }

    @Override
    void bayar(Pembayaran pembayaran, double jumlah) {
        System.out.println("Pembayaran untuk Paket Internasional: " + namaPaket);
        pembayaran.prosesPembayaran(jumlah);
    }
}

public class Paket_07651 {
    public static void main(String[] args) {
        Pembayaran pembayaranTunai = new PembayaranTunai();
        Pembayaran pembayaranKartu = new PembayaranKartu("1234-5678-9012-3456", "Budi Arye");

        Paket paketDomestik = new PaketDomestik("Paket Liburan Bali");
        Paket paketInternasional = new PaketInternasional("Paket Tour Eropa");

        paketDomestik.bayar(pembayaranTunai, 150000);
        paketInternasional.bayar(pembayaranKartu, 3000000);
    }
}
