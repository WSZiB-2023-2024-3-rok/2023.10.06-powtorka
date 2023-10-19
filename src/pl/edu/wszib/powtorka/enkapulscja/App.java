package pl.edu.wszib.powtorka.enkapulscja;

public class App {
    public static void main(String[] args) {
        Square s = new Square(5);

        System.out.println(s.getSide());
        System.out.println(s.getCircuit());
        System.out.println(s.getField());

        s.setSide(7);

        System.out.println(s.getSide());
        System.out.println(s.getCircuit());
        System.out.println(s.getField());

        s.setSide(7);


        s.setSide(7);


        s.setSide(7);

        s.setSide(7);
    }
}
