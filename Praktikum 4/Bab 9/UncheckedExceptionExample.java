public class UncheckedExceptionExample {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b; 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Contoh NullPointerException
        try {
            String str = null;
            System.out.println(str.length()); 
        } catch (NullPointerException e) {
            System.out.println("Error: Objek bernilai null.");
        }
    }
}
