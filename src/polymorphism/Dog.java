package polymorphism;

public class Dog extends Animal{
    public void bark(){
        System.out.println("Dog barks");
    }

    @Override
    public void eat() {
        System.out.println("dog eats");
    }

    @Override
    public void sleeps() {
        System.out.println("dog sleeps");
    }
}
