abstract class Transportasi {
    String nama;
    int kapasitas;

    abstract String  caraMemesan();

    abstract double hitungTarif(int jarak);

    abstract void bergerak();

    Transportasi(String nama, int kapasitas){
        this.nama = nama;
        this.kapasitas = kapasitas;
        
    }
}

interface Pembayaran{
    void bayar(double jumlah);
}

class Taksi extends Transportasi implements Pembayaran                                       {
    double tarifPerKm;


    Taksi(String nama, int kapasitas, double tarifPerKm){
        super(nama, kapasitas);
        this.tarifPerKm = tarifPerKm;
    }

    @Override
    String caraMemesan() {
        return "Pesan melalui aplikasi";
    }

    @Override
    double hitungTarif(int jarak) {
        return tarifPerKm * jarak;
    }
 
    @Override
    public void bayar(double jumlah) {
        System.out.println("Bayar dengan uang tunai atau kartu " + jumlah + " Rupiah");
    }

    @Override
    void bergerak() {
        System.out.println(nama + " Taksi bergerak");
    }
}   

class Bus extends Transportasi implements Pembayaran{
    double tarifPerPenumpang;


    Bus(String nama, int kapasitas, double tarifPerPenumpang){
        super(nama, kapasitas);
        this.tarifPerPenumpang = 2000;
    }

    @Override
    String caraMemesan() {
        return "Pesan melalui terminal atau halte";
    }

    @Override
    double hitungTarif(int jarak) {
        return tarifPerPenumpang * kapasitas;
    }

    @Override
    public void bayar(double jumlah) {
        System.out.println("Bayar dengan uang tunai " + jumlah + " Rupiah");
    }

    @Override
    void bergerak() {
        System.out.println(nama + " Bus bergerak");
    }
}

class KeretaApi extends Transportasi{
    double tarifDasar;

    KeretaApi(String nama, int kapasitas, double tarifDasar){
        super(nama, kapasitas);
        this.tarifDasar = 5000;
    }

    @Override
    String caraMemesan() {
        return "Pesan melalui aplikasi atau datang langsung ke stasiun";
    }

    @Override
    double hitungTarif(int jarak) {
        return tarifDasar * kapasitas;
    }

    @Override
    void bergerak() {
        System.out.println("Kereta Api bergerak");
    }
}


public class Tranport2_07651 {
    public static void main(String[] args) {
        Taksi taksi = new Taksi("Blue Bird", 4, 5000);

        taksi.bergerak();
        double tarifTaksi = taksi.hitungTarif(10);
        taksi.bayar(tarifTaksi);

    }
}
