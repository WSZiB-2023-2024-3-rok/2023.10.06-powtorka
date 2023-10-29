package pl.edu.wszib.powtorka.dziedziczenie;

public class App {
    public static void main(String[] args) {
        Dog dog = new Dog("Reksio", "Kundel", 7);
        System.out.println(dog.getName());
        dog.bark();
        dog.walk();

        Cat cat = new Cat("Puszek", "Dachowiec", 5);
        System.out.println(cat.getName());

        Pet pet = new Dog("Reksio", "Kundel", 7);
        Object object = new Dog("Reksio", "Kundel", 7);

        //Dog dog1 = new Pet("Cos", "cos", 15);

        pet.walk();
        if(pet instanceof Dog) {
            Dog dog2 = (Dog) pet;
            dog2.bark();
            dog2.walk();
        }

        Pet[] pets = new Pet[2];

        pets[0] = new Dog("dsfa", "asdf", 4);
        pets[1] = new Cat("asdf", "asdf", 5);

        for(Pet pet2 : pets) {
            if(pet2 instanceof Dog) {
                System.out.println("to jest pies !!!");
                Dog dog2 = (Dog) pet2;
                dog2.bark();
            } else if(pet2 instanceof Cat) {
                System.out.println("to jest kot !!!");
                Cat cat2 = (Cat) pet2;
                cat2.walk();
            }
        }

        dog.equals(new Dog("asdf", "asdf", 3));

        Snake snake = new Snake("Python", "Pyton", 10);
        snake.walk();

        int a = 5;
        double d = a;

        double d1 = 5.5;
        int a1 = (int) d1;

    }
}
