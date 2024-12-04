interface Pembayaran {
    void prosesPembayaran(double jumlah);
}

interface ValidasiPembayaran {
    boolean validasi(double jumlah);
}

class ValidasiSaldo implements ValidasiPembayaran {
    private double saldo;

    public ValidasiSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean validasi(double jumlah) {
        System.out.println("Memeriksa saldo...");
        return saldo >= jumlah;
    }
}

class ValidasiKartu implements ValidasiPembayaran {
    private String nomorKartu;

    public ValidasiKartu(String nomorKartu) {
        this.nomorKartu = nomorKartu.replaceAll("[^0-9]", ""); // Hapus semua karakter non-angka
    }

    @Override
    public boolean validasi(double jumlah) {
        System.out.println("Memeriksa nomor kartu...");
        return nomorKartu.length() == 16;
    }
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
        this.nomorkartu = nomorkartu.replaceAll("[^0-9]", ""); // Hapus karakter non-angka
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

    public void validasiPembayaran(ValidasiPembayaran validasi, Pembayaran pembayaran, double jumlah) {
        if (validasi.validasi(jumlah)) {
            System.out.println("Validasi berhasil.");
            bayar(pembayaran, jumlah);
        } else {
            System.out.println("Validasi gagal. Pembayaran dibatalkan.");
        }
    }
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

public class ValidasiPembayaran_07651 {
    public static void main(String[] args) {
        ValidasiPembayaran validasiSaldo = new ValidasiSaldo(200000);
        ValidasiKartu validasiKartu = new ValidasiKartu("1234-5678-9012-3456");

        Pembayaran pembayaranTunai = new PembayaranTunai();
        Pembayaran pembayaranKartu = new PembayaranKartu("1234-5678-9012-3456", "Budi Arye");

        Paket paketDomestik = new PaketDomestik("Paket Liburan Bali");
        Paket paketInternasional = new PaketInternasional("Paket Tour Eropa");

        System.out.println("Proses untuk Paket Domestik:");
        paketDomestik.validasiPembayaran(validasiSaldo, pembayaranTunai, 150000);

        System.out.println("\nProses untuk Paket Internasional:");
        paketInternasional.validasiPembayaran(validasiKartu, pembayaranKartu, 3000000);
    }
}
