package polymorphism;

public class TestPolymorphism {
    public static void main(String[] args) {
        System.out.println("......Testing Animal Object........");
        Animal a1=new Animal();
        a1.eat();
        a1.sleeps();

        System.out.println("......Testing Dog Object........");
        Dog d1 =new Dog();
        d1.eat();
        d1.sleeps();
        d1.bark();

        System.out.println("......Dog Object in the shape of Animal........");
        Animal a2=new Dog();//up-casting opposite down casting
        a2.sleeps();
        a2.eat();
        a2.eat(" food");// animal eats food

        a2.sleep(1);

    }
}
