package pl.edu.wszib.powtorka;

public class Snake extends Pet {

    public Snake() {
        super("x", "y", 10);
    }

    @Override
    void walk() {
        System.out.println("Pelzam !!!");
    }
}
