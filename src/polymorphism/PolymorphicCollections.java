package polymorphism;

import java.util.ArrayList;
import java.util.Arrays;

public class PolymorphicCollections {
    public static void main(String[] args) {
        Cat cat1=new Cat();
        Dog dog1=new Dog();

        System.out.println("..........Cat object..........");

        cat1.eat();
        cat1.sleeps();
        cat1.eat("fish");

        System.out.println("..........Dog object..........");
        dog1.eat();
        dog1.sleeps();
        dog1.eat("meat");


        System.out.println("..........Animal........");
        Animal animal1=new Animal();
        animal1.eat();//Animal eats
        animal1.eat("food");//Animal eats some food //overloading static polymorphism
        animal1.sleeps();


        System.out.println("..........Cat and Dog objects in Animal SHAPE..........");

        Animal animal2=new Cat();
        Animal animal3=new Dog();
        animal3.eat();
        animal3.sleeps();
        animal2.sleeps();
        animal2.eat();


        Animal[] animals={cat1,dog1,animal1,animal2,animal3};
        for (Animal animal : animals) {
            System.out.println(animal.getClass().getSimpleName());
        }
        //ArrayList<Animal> myAnimal=new ArrayList<>(animals);
        ArrayList<Animal> myAnimal=new ArrayList<>();
        myAnimal.add(cat1);
        myAnimal.add(dog1);
        myAnimal.add(animal1);
        myAnimal.add(animal2);
        myAnimal.add(animal3);


        /**
         * 1.way
         */
        for (Animal animal : myAnimal) {
             animal.eat();
        }
        /**
         * 2.way
         */
        myAnimal.forEach(Animal::eat);
        /**
         * 3.way
         */
        new ArrayList<>(Arrays.asList(animals)).forEach(Animal::eat);


    }
}
