import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class fileCollector{
    public void createFile(){
        String directoryPath = "D:\\Kuliah\\Semester 3\\Coding Java\\Praktikum 5";
        String fileName = "file_07651.txt";
        String fileContent = "Membuat File Dengan Java";

        try {
            File file = new File(directoryPath + "\\" + fileName);
            if (file.createNewFile()) {
                System.out.println("File berhasil dibuat");
                try(FileWriter writer = new FileWriter(file)){
                    writer.write(fileContent);
                    System.out.println("Berhasil menulis ke file");
                }
            } else {
                System.out.println("File sudah ada : " + fileName);
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membuat file");
            e.printStackTrace();
        }
    }
}

public class file_07651 {
    public static void main(String[] args) {
        fileCollector file = new fileCollector();
        file.createFile();
    }
}