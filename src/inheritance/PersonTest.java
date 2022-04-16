package inheritance;

import package5.Singer;

import java.util.ArrayList;
import java.util.List;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        Tester tester1 = new Tester();
        Singer singer1 = new Singer();
        Dancer dancer1 = new Dancer();
        //give a name first name last name gender dob ssn to all object

        person1.fName = "John Doe";
        person1.age = 45;
        person1.gender = "Male";
        person1.setDob("01/01/1977");
        person1.setSsn("000-00-0000");


        tester1.fName = "Abe Kim";
        tester1.age = 20;
        tester1.gender = "Male";
        tester1.setDob("01/12/2002");
        tester1.setSsn("111-11-1111");

        singer1.fName = "Kaly Ngo";
        singer1.age = 15;
        singer1.gender = "female";
        singer1.setDob("05/10/2007");
        singer1.setSsn("222-22-2222");

        dancer1.fName = "Alona Q";
        dancer1.age = 15;
        dancer1.gender = "female";
        dancer1.setDob("10/10/2007");
        dancer1.setSsn("333-33-3333");

        System.out.println(person1);
        System.out.println(tester1);
        System.out.println(singer1);
        System.out.println(dancer1);

        Person person2 = new Person(("jane"), "Doe", 45, "female");
        person2.setDob("01/01/1977");
        person2.setSsn("555-55-5555");
        Tester tester2 = new Tester("YUNG", "kim", 20, "male");
        tester2.setDob("01/12/2002");
        tester2.setSsn("777-77-7777");
        Singer singer2 = new Singer(("Jessie"), "J", 15, "Female");
        singer2.setDob("05/10/2007");
        singer1.setSsn("666-66-6666");
        Dancer dancer2 = new Dancer("B", "Q", 18, "female");
        dancer2.setDob("10/10/2007");
        dancer2.setSsn("999-99-99");

        List<Person> myList = new ArrayList<>();
        myList.add(person2);
        myList.add(tester2);
        myList.add(singer2);
        myList.add(dancer2);

        myList.forEach(System.out::println);

        Person[] personArr = {person2, singer2, tester2, dancer2};
        for (Person person : personArr) {
            System.out.println(person);
        }

        tester1.code();
        dancer2.dance();
        singer1.sing();
    }


}



