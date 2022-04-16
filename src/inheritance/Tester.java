package inheritance;

public class Tester extends Person {

    public Tester(){

    }
    public Tester(String fName, String lName, int age, String gender) {
        super(fName, lName, age, gender);
    }

    public void code(){
        System.out.println("tester codes");
    }

    @Override
    public void sleep() {
        System.out.println("tester sleeps");
    }

    @Override
    public void learn() {
        System.out.println("tester learns");
    }

    @Override
    public void walk() {
        System.out.println("tester walks");
    }

    @Override
    public void eat() {
        System.out.println("tester eats");
    }
}
