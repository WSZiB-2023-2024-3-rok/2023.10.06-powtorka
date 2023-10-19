package pl.edu.wszib.powtorka;

public class Pet {
    String name;
    String race;
    int age;

    public Pet(String name, String race, int age) {
        this.name = name;
        this.race = race;
        this.age = age;
    }

    void walk() {
        System.out.println("ide na czterech lapach !!!");
    }
}
