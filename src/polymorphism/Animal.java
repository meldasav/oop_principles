package polymorphism;

public class Animal {

    public void eat() {
        System.out.println("Animal eats");
    }

    public void eat(String s) {
        System.out.println("Animal eats " + s);
    }

    public void sleeps() {
        System.out.println("Animal sleeps");
    }
    public void sleep(int hour){
        System.out.println("Dog sleeps " + hour + " hours");
    }

}