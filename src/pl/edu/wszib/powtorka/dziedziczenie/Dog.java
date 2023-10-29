package pl.edu.wszib.powtorka.dziedziczenie;

public class Dog extends Pet {

    public Dog(String name, String race, int age) {
        super(name, race, age);
        //??
        //??
        //??
    }

    public void bark() {
        System.out.println("Hau hau !!!");
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Dog)) {
            return false;
        }

        if(this == obj) {
            return true;
        }

        Dog dog = (Dog) obj;
        return this.getName().equals(dog.getName())
                && this.getRace().equals(dog.getRace())
                && this.getAge() == dog.getAge();
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.getRace() + " " + this.getAge();
    }
}
