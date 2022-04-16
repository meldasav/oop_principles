package inheritance;

public class Person {
  //default constructor
    public Person(){

    }
    //4 arg constructor


    public Person(String fName, String lName, int age, String gender) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.gender = gender;
    }

    //instance variable
    public String fName;
    public String lName;
    protected int age;
    protected String gender;
    double weight;
    double height;
    private String dob;
    private String ssn;


    public void sleep(){
        System.out.println("person sleeps");
    }
    public void learn(){
        System.out.println("person learns");
    }
    public void walk(){
        System.out.println("person walks");
    }
    public void eat(){
        System.out.println("person eats");
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +"{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", dob='" + dob + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}

