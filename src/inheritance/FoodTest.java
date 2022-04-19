package inheritance;

import java.util.ArrayList;
import java.util.Iterator;

public class FoodTest {
    public static void main(String[] args) {
        Food food1 = new Food();
        food1.taste = "delicious";
        food1.name = "sushi";
        food1.isSpicy = true;
        food1.setOrganic(true);
        System.out.println(food1.name);
        System.out.println(food1.isOrganic());
        System.out.println(food1);

        Vegetable vegetable = new Vegetable();
        vegetable.taste = "good";
        vegetable.name = "parsley";
        vegetable.isSpicy = false;
        vegetable.setOrganic(true);
        vegetable.color = "green";
        System.out.println(vegetable.name);
        System.out.println(vegetable.color);
        System.out.println(vegetable.isOrganic());
        System.out.println(vegetable);

        Vegetable vegetable2 = new Vegetable();
        vegetable2.name="broccoli";
        System.out.println(vegetable2);


        ArrayList<Food> allFoods=new ArrayList<>();
        allFoods.add(food1);
        allFoods.add(vegetable);
        allFoods.add(vegetable2);
         int count=0;
        for (Food allFood : allFoods) {
            if(allFood.name.length()>5)count++;
        }
        System.out.println(count);

        //LAMBDA
        System.out.println(allFoods.stream().filter(food -> food.name.length()>5).count());





    }
}