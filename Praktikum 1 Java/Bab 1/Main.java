class Mobil {
    String merk;
    String model;
    String warna;

    Mobil(String merk, String model, String warna) {
        this.merk = merk;
        this.model = model;
        this.warna = warna;
    }

    void hidupkanMesin() {
        System.out.println(merk + " " + model + " mesin dihidupkan.");
    }

    void catMobil() {
        System.out.print(merk + " " + model + " dicat dengan warna " + warna);
    }

    void rem() {
        System.out.println(merk + " " + model + " sedang mengerem.");
    }
}

public class Main {
    public static void main(String[] args) {
        Mobil mobilku = new Mobil("Toyota", "Corolla", "Merah");

        mobilku.hidupkanMesin(); 
        mobilku.rem();    
        mobilku.catMobil();       
    }
}
