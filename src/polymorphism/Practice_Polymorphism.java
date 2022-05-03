package polymorphism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Practice_Polymorphism {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Cat cat1 = new Cat();
        cat1.eat();
        cat1.sleeps();
        dog1.eat();
        dog1.eat("meat");//Animal eats/ meat eat method with 1 arg it is in Animal class
        dog1.sleeps();

        Animal animal1=new Animal();
        animal1.eat();
        animal1.eat("some food");
        animal1.sleeps();

        Animal animal2=new Cat();
        Animal animal3=new Cat();

        animal2.eat();
        animal3.sleeps();

        Animal animal4=new Dog();
        animal4.eat();
        animal4.sleeps();

        Animal[] animals={cat1,dog1,animal1,animal2,animal3,animal4};
        for (Animal animal : animals) {
            System.out.println(animal.getClass().getSimpleName());
        }
        ArrayList<Animal> myCollection = new ArrayList<>(Arrays.asList(animals));
        for(Animal a :myCollection){
            a.eat();
        }
        /**
         * 2.way
         */
        myCollection.forEach(Animal::eat);

        Object[]elements={5,10.5,'*',"ALEX",true, new Dog(),new Scanner(System.in),new ArrayList<>()};

        for (Object element : elements) {
            System.out.println(element.getClass().getSimpleName());
        }
        Dog dog2=(Dog) elements[5];
        dog2.bark();
        dog2.sleeps();

    }
}