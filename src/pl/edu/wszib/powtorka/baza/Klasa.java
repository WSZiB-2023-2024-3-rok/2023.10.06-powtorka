package pl.edu.wszib.powtorka.baza;

public class Klasa {

    static int wiek;

    final int JAKIAS_INNA_STALA;

    public Klasa() {
        this.JAKIAS_INNA_STALA = 10;
    }

    static {
        for (int i = 0; i < 10; i++) {
            System.out.println("cos !!!");
        }
    }
    public static int zmienna;

    public static void metoda() {
        System.out.println("metoda statyczna !!!");
        int zmiennaLokalna = 15;
        System.out.println(zmiennaLokalna);
        wiek = 10;
        innaMetoda();
    }

    public static void innaMetoda() {
        System.out.println();
    }
}
