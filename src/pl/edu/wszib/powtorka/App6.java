package pl.edu.wszib.powtorka;

public class App6 {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;

        System.out.println(a == b);

        Square square = new Square(5);
        Square square2 = square;

        System.out.println(square == square2);

        square.field = 10;

        System.out.println(square.field);
        System.out.println(square2.field);

        String s1 = "Janusz";
        String s2 = "Janusz";

        System.out.println(s1 == s2);
    }
}
