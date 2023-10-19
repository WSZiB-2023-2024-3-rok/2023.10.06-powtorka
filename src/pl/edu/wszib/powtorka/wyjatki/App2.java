package pl.edu.wszib.powtorka.wyjatki;

public class App2 {
    public static void main(String[] args) {

        //generateException(5);
        try {
            generateException(5);
        } catch (Exception e) {
            System.out.println("Jest wyjatek !!!");
        }

    }

    public static void generateException(int a) throws JakisMojException {
        if(a == 5) {
            throw new JakisMojException();
        }
    }
}
