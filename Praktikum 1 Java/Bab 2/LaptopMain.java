class Laptop {
    String merek;
    String prosesor;
    int ram;

    public Laptop(String merek, String prosesor, int ram) {
        this.merek = merek;
        this.prosesor = prosesor;
        this.ram = ram;
    }
    public void upgradeRam(int tambahanRam) {
        ram += tambahanRam;
        System.out.println("RAM berhasil di-upgrade menjadi: " + ram + " GB");
    }

    public void tampilkanInfo() {
        System.out.println("Merek: " + merek);
        System.out.println("Prosesor: " + prosesor);
        System.out.println("RAM: " + ram + " GB");
    }
}

public class LaptopMain {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("ASUS", "Intel i7", 8);

        laptop1.tampilkanInfo();

        laptop1.upgradeRam(8);
        laptop1.tampilkanInfo();
    }
}
