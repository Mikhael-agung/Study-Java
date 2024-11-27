import java.io.*;

public class CheckedException {
    public static void main(String[] args) {
        // Membuka file yang tidak ada untuk menimbulkan FileNotFoundException
        try (FileReader fileReader = new FileReader("nonexistent_file.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            // Membaca isi file
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File tidak ditemukan.");
        } catch (IOException e) {
            System.out.println("Error: Terjadi kesalahan saat membaca file.");
        }
    }
}
