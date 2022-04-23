package polymorphism;

public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("Cat eats");
    }

    @Override
    public void sleeps() {
        System.out.println("Cat sleeps");
    }
}
