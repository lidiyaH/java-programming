package day40_arrayList;
import java.util.*;
public class ArrayListMethods {
    public static void main(String[] args) {
       List<String> shoppingList = new ArrayList<>();
        System.out.println("size " + shoppingList.size());
        System.out.println("is empty = " + shoppingList.isEmpty());
        if (shoppingList.isEmpty()) {
            System.out.println("list is empty");
        }else {
            System.out.println("list is not empty");
        }
        shoppingList.add("shoes");
        shoppingList.add("cheap monitor");
        shoppingList.add("mask");
        shoppingList.add("wooden spoon");
        shoppingList.add("scooter");
        shoppingList.add("java book");
        shoppingList.add("tesla");
        if (shoppingList.isEmpty()) {
            System.out.println("list is empty");
        }else {
            System.out.println("list is not empty, let's go to the mall");
        }
        int count = shoppingList.size();
        System.out.println("Items to buy = " + count);
        System.out.println("is shoes in my list? " + shoppingList.contains("shoes"));
        shoppingList.remove("shoes");
        System.out.print(shoppingList + " ");
    }
}
