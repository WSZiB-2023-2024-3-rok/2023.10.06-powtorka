package pl.edu.wszib.powtorka;

public class App9 {
    public static void main(String[] args) {
        final int a;
        a = 40;
        //a = 10;
        final Square square = new Square(5);
        System.out.println(square.circle);
        System.out.println(square.side);
        System.out.println(square.field);

        square.side = 20;

        System.out.println(square.circle);
        System.out.println(square.side);
        System.out.println(square.field);

//        square = null;
//        square = new Square(10);
    }
}
