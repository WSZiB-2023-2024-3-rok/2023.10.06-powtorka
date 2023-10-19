package pl.edu.wszib.powtorka.wyjatki;

import pl.edu.wszib.powtorka.Client;

public class App {
    public static void main(String[] args) {
        try {
            Client[] clients = new Client[10];
            clients[110].getAge();

            System.out.println("koniec bloku try");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("cos sie zepsulo !!");
        } catch (NullPointerException e) {
            System.out.println("Polecial null pointer !!");
        } finally {
            System.out.println("Zawsze na koncu !!!");
        }

        System.out.println("Dalsza czesc programu !!");
    }
}
