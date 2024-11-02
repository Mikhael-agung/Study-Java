public class Mahasiswa {
    String namaLengkap;
    String npm;
    String jenisKelamin;

    public Mahasiswa() {
        this.namaLengkap = "Tidak diketahui";
        this.npm = "Tidak diketahui";
        this.jenisKelamin = "Tidak diketahui";
    }

    public Mahasiswa(String namaLengkap, String npm, String jenisKelamin) {
        this.namaLengkap = namaLengkap;
        this.npm = npm;
        this.jenisKelamin = jenisKelamin;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Lengkap: " + this.namaLengkap);
        System.out.println("NPM: " + this.npm);
        System.out.println("Jenis Kelamin: " + this.jenisKelamin);
        System.out.println();
    }

    public static void main(String[] args) {
        // Membuat objek Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa();  
        Mahasiswa mahasiswa2 = new Mahasiswa("Ahmad Setiawan", "123456789", "Laki-laki"); 
        Mahasiswa mahasiswa3 = new Mahasiswa("Nina Sari", "987654321", "Perempuan");  

        mahasiswa1.tampilkanInfo();
        mahasiswa2.tampilkanInfo();
        mahasiswa3.tampilkanInfo();
    }
}

