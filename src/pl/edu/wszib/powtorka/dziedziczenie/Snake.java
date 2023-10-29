package pl.edu.wszib.powtorka.dziedziczenie;

public class Snake extends Pet {
    public Snake(String name, String race, int age) {
        super(name, race, age);
    }

    @Override
    public void walk() {
        System.out.println("pelzam !!");
    }
}
