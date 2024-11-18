
public class mainC_07651 {
    public static Void main(String[] args){
        kendaraan.kapal kapal = new kendaraan.kapal("Verry" ,"tug boat");
        kendaraan.pesawat pesawat = new kendaraan.pesawat("AU", "psas");
        kendaraan.mobil mobil = new kendaraan.mobil("Toyota", "Sedan");

        mobil.tampilkanDataMobil();
        pesawat.tampilkanDataPesawat();
        kapal.tampilkanKapal();
    }
}
