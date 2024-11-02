
class buku{
    String judul;
    String penulis;
    String tahunTerbit;

    public buku(String judulBuku, String penulisBuku, String tahunTerbitBuku){
        this.judul = judulBuku;
        this.penulis = penulisBuku;
        this.tahunTerbit = tahunTerbitBuku;
    }

    public buku(){
        this.judul = "JS Programming";
        this.penulis = "John Doe";
        this.tahunTerbit = "2023";
    }

      public static void main(String[] args) {
        buku myBuku = new buku("Java Programming", "John Doe", "2023");
        System.out.println("Judul: " + myBuku.judul + "\n" + "Penulis: " + myBuku.penulis + "\n" + "Tahun Terbit: " + myBuku.tahunTerbit);
        buku myBuku1 = new buku();
        System.out.println("Judul: " + myBuku1.judul + "\n" + "Penulis: " + myBuku1.penulis + "\n" + "Tahun Terbit: " + myBuku1.tahunTerbit);
    }
}
