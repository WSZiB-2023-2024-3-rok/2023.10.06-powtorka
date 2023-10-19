package pl.edu.wszib.powtorka;

public class Dog extends Pet {
    int waga;

    public Dog() {
        super("Reksio", "Kundel", 10);
        this.waga = 5;
    }

    void bark() {
        System.out.println("Hau hau !!!");
    }
}
