package pl.edu.wszib.powtorka.finaistatic;

public class App {
    public static void main(String[] args) {
        final int a = 5;
        //a = 10;

        System.out.println(a);

        final Client c = new Client("Zbyszek", "Kowalski");
        c.setName("Bogdan");

        //c = null;

        System.out.println(c.getName());
        System.out.println(c.getSurname());

        final int JAKAS_MOJA_STALA = 45;

        System.out.println("***********************");

        //Klasa klasa = new Klasa();
        Klasa.zmienna = 20;
        System.out.println(Klasa.zmienna);
        Klasa.cos();

        Klasa klasa1 = new Klasa();
        Klasa klasa2 = new Klasa();

        klasa1.zmienna = 15;

        System.out.println(Klasa.zmienna);
        System.out.println(klasa1.zmienna);
        System.out.println(klasa2.zmienna);
    }
}
