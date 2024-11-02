class Mesin {
    private String tipeMesin;

    public Mesin(String tipeMesin) {
        this.tipeMesin = tipeMesin;
    }

    public String getTipeMesin() {
        return tipeMesin;
    }

    public void nyalakan() {
        System.out.println("Mesin " + tipeMesin + " dinyalakan.");
    }
}

class Mobil {
    private String merek;
    private Mesin mesin; 

    public Mobil(String merek) {
        this.merek = merek;
    }

    public String getMerek() {
        return merek;
    }

    public void pasangMesin(Mesin mesin) {
        this.mesin = mesin;
        System.out.println("Mesin " + mesin.getTipeMesin() + " dipasang pada mobil " + merek + ".");
    }

    public void nyalakanMesin() {
        if (mesin != null) {
            mesin.nyalakan(); 
            System.out.println("Mesin belum dipasang!");
        }
    }
}

public class Mobil1 {
    public static void main(String[] args) {
        Mesin mesin1 = new Mesin("V8");
        Mesin mesin2 = new Mesin("V6");

        Mobil mobil1 = new Mobil("Toyota");
        Mobil mobil2 = new Mobil("Honda");

        
        mobil1.pasangMesin(mesin1);
        mobil2.pasangMesin(mesin2);

        mobil1.nyalakanMesin();
        mobil2.nyalakanMesin();
    }
}
