package Animals;

public class Main {

    public static void main(String[] args) {
        // Part 2: Dog
        Dog dog = new Dog();
        dog.bark();
        dog.eat();

        Dog fido = new Dog("Fido");
        fido.bark();

        // Part 3: Cat
        System.out.println();
        Cat cat = new Cat();
        cat.purr();
        cat.eat();

        Cat garfield = new Cat("Garfield");
        garfield.purr();

        // Part 4: NoiseCapable
        System.out.println();
        NoiseCapable dog2 = new Dog();
        dog2.makeNoise();

        NoiseCapable cat2 = new Cat("Garfield");
        cat2.makeNoise();
        Cat c = (Cat) cat2;
        c.purr();

    }

}
