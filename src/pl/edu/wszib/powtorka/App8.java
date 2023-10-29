package pl.edu.wszib.powtorka;

import pl.edu.wszib.powtorka.baza.Klasa;

public class App8 {
    public static void main(String[] args) {
        Client client = new Client();
        client.name = "Janusz";


        Klasa.zmienna = 10;
        System.out.println("Zaraz po ustawieniu zmiennej statycznej i pierwszym uzyciu Klasa");

        Klasa obiekt = new Klasa();
        obiekt.zmienna = 15;

        System.out.println(obiekt.zmienna);
        System.out.println(Klasa.zmienna);

        Klasa obiekt2 = new Klasa();
        obiekt2.zmienna = 30;

        System.out.println(obiekt.zmienna);
        System.out.println(Klasa.zmienna);
        System.out.println(obiekt2.zmienna);

        Klasa.metoda();
    }
}
