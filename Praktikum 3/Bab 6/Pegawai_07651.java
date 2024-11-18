class Pegawai {

    public double hitungGaji(double gajiPokok, double tunjanganKhusus, double bonus) {
        return gajiPokok + tunjanganKhusus + bonus;
    }

    public double hitungGaji(double jamKerja, double tarifPerJam) {
        return jamKerja * tarifPerJam;
    }

    public double hitungGaji(double gajiTetap) {
        return gajiTetap;
    }
}

public class Pegawai_07651 {
    public static void main(String[] args) {
        Pegawai pegawai = new Pegawai();

        double gajiPegawaiTetap = pegawai.hitungGaji(5000000, 2000000, 1000000);
        System.out.println("Gaji Pegawai Tetap: " + gajiPegawaiTetap);

        double gajiPegawaiPartTime = pegawai.hitungGaji(40, 50000);
        System.out.println("Gaji Pegawai Part-Time: " + gajiPegawaiPartTime);

        double gajiPegawaiMagang = pegawai.hitungGaji(2000000);
        System.out.println("Gaji Pegawai Magang: " + gajiPegawaiMagang);
    }
}
