package encapsulation;

public class Employee {

  //default constructor
  public Employee(){

  }
  //instance variables
  private final static int totalEmployees=10;
  public String fullName;
  public int age;
  public String address;
  public String phone;


  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public static int getTotalEmployees(){
    return totalEmployees;
  }

  @Override
  public String toString() {
    return "Employee{" +
            "fullName='" + fullName + '\'' +
            ", age=" + age +
            ", address='" + address + '\'' +
            ", phone='" + phone + '\'' +
            '}';
  }
}
