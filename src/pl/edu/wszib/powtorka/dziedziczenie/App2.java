package pl.edu.wszib.powtorka.dziedziczenie;

public class App2 {
    public static void main(String[] args) {
        String a = new String("Janusz");
        String b = new String("Janusz");

        System.out.println(a.equals(b));

        Dog dog = new Dog("Reksio", "Kundel", 7);
        Dog dog2 = new Dog("Reksio", "Kundel", 7);

        System.out.println(dog.equals(dog2));

        System.out.println(dog);
    }
}
