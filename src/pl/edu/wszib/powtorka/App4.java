package pl.edu.wszib.powtorka;

public class App4 {
    public static void main(String[] args) {
        Client[] clients = new Client[100];

        clients[0] = new Client();
        clients[1] = new Client();

        Client janusz = new Client();
        janusz.name = "Janusz";
        janusz.surname = "Kowalski";
        janusz.age = 50;
        janusz.pesel = 123123123;

        Client wiesiek = new Client();
        wiesiek.name = "Wiesiek";
        wiesiek.surname = "Malinowski";
        wiesiek.age = 40;
        wiesiek.pesel = 324234;

        System.out.println(janusz.dodaj(5, 8));
        System.out.println(janusz.dodaj(5.5, 8.8));

        wiesiek.powiedzSwojeImie();
        janusz.powiedzSwojeImie();

        Client client = new Client();
        System.out.println(client.name);
        System.out.println(client.surname);
        System.out.println(client.age);
        System.out.println(client.pesel);

        System.out.println(client.name.isBlank());
    }
}
