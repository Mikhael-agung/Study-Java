public class UncheckedExceptionExample {
    public static void main(String[] args) {
        // Contoh ArithmeticException
        try {
            int a = 10;
            int b = 0;
            int result = a / b; // Menimbulkan ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Error: Tidak dapat membagi dengan nol.");
        }

        // Contoh NullPointerException
        try {
            String str = null;
            System.out.println(str.length()); // Menimbulkan NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Error: Objek bernilai null.");
        }
    }
}
