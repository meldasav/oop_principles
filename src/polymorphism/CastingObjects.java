package polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CastingObjects {
    public static void main(String[] args) {
        Cat cat1=new Cat();//NO CASTING
        /**
         * up casting putting smaller data into bigger data
         * it happens implicitly
         */
        Animal animal1=new Cat(); // up casting
        Object object1=new Cat();// up casting
        List<Animal> animals= new ArrayList<>();//up casting Arraylist in the shape of List

        /**
         * down casting putting bigger to smaller explicitly
         */

      //  Dog dog1=(Dog) new Animal();//error you are saying every animal dog
    //    System.out.println(dog1);
        Animal a1=new Dog();//up casting
        Dog dog2=(Dog) a1;//down casting
        a1.eat();
     //   dog1.eat();
    }
}
