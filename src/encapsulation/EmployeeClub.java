package encapsulation;

import java.util.Scanner;

public class EmployeeClub {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee employee1 = new Employee();
        System.out.println("'What is your name?");
        employee1.setFullName(input.nextLine());

        System.out.println("And the age please");
        employee1.setAge(input.nextInt());
        input.nextLine();
        System.out.println("Lastly address please");
        employee1.setAddress(input.nextLine());

        System.out.println(employee1);//
        if(employee1.getAddress().toLowerCase().contains("chicago") && employee1.getAge()>21){
            System.out.println(employee1.getFullName() + "is in the club");
        }
        else{
            System.out.println(employee1.getFullName() + "is not in the club");
        }
    }
}