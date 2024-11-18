import kendaraan.*;
// soal no 1
public class mainA_07651 {
    public static void main(String[] args) {
    kapal kapal = new kapal("Verry" ,"tug boat");
    pesawat pesawat = new pesawat("AU", "APACHE");
    mobil mobil = new mobil("Toyota", "Sedan");

    mobil.tampilkanDataMobil();
    pesawat.tampilkanDataPesawat();
    kapal.tampilkanKapal();
    }
}
