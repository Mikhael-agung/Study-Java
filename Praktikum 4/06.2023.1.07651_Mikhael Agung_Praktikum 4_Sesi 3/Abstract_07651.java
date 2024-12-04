abstract class Animal {
    String nama;

    Animal(String nama) {
        this.nama = nama;
    }

    abstract void bersuara();

    void sleep() {
        System.out.println(nama + " mending tidur.");
    }
}

class Wolf extends Animal {

    Wolf(String name) {
        super(name);
    }

    @Override
    void bersuara() {
        System.out.println(nama + " says: Howl Howl");
    }
}

class Dog extends Wolf {

    Dog(String name) {
        super(name);
    }

    @Override
    void bersuara() {
        System.out.println(nama + " says: Woof Woof");
    }
}

public class Abstract_07651 {
    public static void main(String[] args) {
        try {
            Wolf seringila = new Wolf("Budyeah");
            seringila.bersuara();
            seringila.sleep();

            Dog anjing = new Dog("Aryeah");
            anjing.bersuara();
            anjing.sleep();

            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {  
            System.out.println("end.");
        }
    }
}
