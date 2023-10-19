package pl.edu.wszib.powtorka;

public class Client {
    String name;
    String surname;
    int age;
    long pesel;

    Client() {
        System.out.println("Tworzy sie nowy obiekt klienta !!");
    }

    int dodaj(int a, int b) {
        return a+b;
    }

    double dodaj(double a, double b) {
        return a+b;
    }

    void powiedzSwojeImie() {
        if(age > 45) {
            return;
        }
        System.out.println(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPesel() {
        return pesel;
    }

    public void setPesel(long pesel) {
        this.pesel = pesel;
    }
}
