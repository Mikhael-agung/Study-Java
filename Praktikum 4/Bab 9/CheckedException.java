import java.io.*;

public class CheckedException {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("nonexistent_file.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

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
