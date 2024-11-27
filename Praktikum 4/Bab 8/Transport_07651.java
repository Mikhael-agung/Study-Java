abstract class Transportasi {
    String nama;
    int kapasitas;

    abstract String caraMemesan();

    abstract String hitungTarif(int jarak);

    Transportasi(String nama, int kapasitas) {
        this.nama = nama;
        this.kapasitas = kapasitas;
    }
}

class Taksi extends Transportasi {
    double tarifPerKm;

    Taksi(String nama, int kapasitas, double tarifPerKm) {
        super(nama, kapasitas);
        this.tarifPerKm = tarifPerKm;
    }

    @Override
    String caraMemesan() {
        return "Pesan melalui aplikasi";
    }

    @Override
    String hitungTarif(int jarak) {
        return tarifPerKm * jarak + " Rupiah";
    }
}

class Bus extends Transportasi {
    double tarifPerPenumpang;

    Bus(String nama, int kapasitas, double tarifPerPenumpang) {
        super(nama, kapasitas);
        this.tarifPerPenumpang = tarifPerPenumpang;
    }

    @Override
    String caraMemesan() {
        return "Pesan melalui terminal atau halte";
    }

    @Override
    String hitungTarif(int jarak) {
        return tarifPerPenumpang * kapasitas + " Rupiah";
    }
}

class KeretaApi extends Transportasi {
    double tarifDasar;

    KeretaApi(String nama, int kapasitas, double tarifDasar) {
        super(nama, kapasitas);
        this.tarifDasar = tarifDasar;
    }

    @Override
    String caraMemesan() {
        return "Pesan melalui aplikasi atau datang langsung ke stasiun";
    }

    @Override
    String hitungTarif(int jarak) {
        return tarifDasar + (jarak * 500) + " Rupiah";
    }
}

public class Transport_07651 {
    public static void main(String[] args) {
        Transportasi taksi = new Taksi("Taksi", 4, 5000);
        Transportasi bus = new Bus("Bus", 40, 2000);
        Transportasi keretaApi = new KeretaApi("Kereta Api", 200, 5000);

        System.out.println("Cara memesan Taksi: " + taksi.caraMemesan());
        System.out.println("Tarif Taksi untuk 10 km: " + taksi.hitungTarif(10) + "\n");

        System.out.println("Cara memesan Bus: " + bus.caraMemesan());
        System.out.println("Tarif Bus untuk 10 km: " + bus.hitungTarif(10) + "\n");

        System.out.println("Cara memesan Kereta Api: " + keretaApi.caraMemesan());
        System.out.println("Tarif Kereta Api untuk 10 km: " + keretaApi.hitungTarif(10) + "\n");
    }
}
