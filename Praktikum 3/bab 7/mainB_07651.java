import kendaraan.kapal;
import kendaraan.mobil;
import kendaraan.pesawat;
// soal no 2
public class mainB_07651 {
    public static void main(String[] args) {
      kapal kapal = new kapal("Verry" ,"tug boat");
      pesawat pesawat = new pesawat("AU", "psas");
      mobil mobil = new mobil("Toyota", "Sedan");

      mobil.tampilkanDataMobil();
      pesawat.tampilkanDataPesawat();
      kapal.tampilkanKapal();
    }
}
