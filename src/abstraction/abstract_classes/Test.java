package abstraction.abstract_classes;

import java.util.ArrayList;

public class Test {


    public static void main(String[] args) {

        Samsung s1 = new Samsung("Samsung", "Black", 64, 700);
        Nokia n1 = new Nokia("Nokia", "Blue", 4, 100);
        Iphone i1 = new Iphone("Apple", "Silver", 128, 1000);


        ArrayList<Phone> myPhone = new ArrayList<>();
        myPhone.add(s1);
        myPhone.add(n1);
        myPhone.add(i1);


        for (Phone phone : myPhone)
            System.out.println(myPhone);

        int max = Integer.MIN_VALUE;
        Phone mostExpensivePhone = null;

        int countConvertible = 0;
        for (Phone phone : myPhone) {
            if (phone.isConvertible()) countConvertible++;
            if (phone.price > max) mostExpensivePhone = phone;
        }
        System.out.println(countConvertible);
        System.out.println("the most expensive phone is = " + mostExpensivePhone.getClass().getSimpleName());
        // 2.way
        int howManyConvertible = 0;
        int mostExpensive = 0;
        for (Phone phone : myPhone) {
            if (phone.isConvertible()) howManyConvertible++;
            if (phone.price > mostExpensive) mostExpensive += phone.price;
        }
        System.out.println("the most expensive " + mostExpensive);

        //3.way

        System.out.println(myPhone.stream().filter(Phone::isConvertible).count());
    }
}