package pl.edu.wszib.powtorka;

public class App7 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.walk();
        dog.bark();
        System.out.println(dog.name);
        System.out.println(dog.race);
        System.out.println(dog.age);
        System.out.println(dog.waga);

        Cat cat = new Cat();
        cat.walk();

        Snake snake = new Snake();
        snake.walk();

        Pet pet = new Dog();
        Object object = new Dog();

        Pet[] tab = new Pet[10];
        tab[0] = new Dog();
        tab[1] = new Cat();
        tab[2] = new Snake();

        if(pet instanceof Dog) {
            Dog d = (Dog) pet;
            d.bark();
        }
    }
}
