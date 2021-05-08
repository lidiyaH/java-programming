package day40_arrayList;

import java.util.ArrayList;

public class ArrayLitsExample {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(6);
        nums.add(5);
        nums.add(7);
        nums.add(9);
        System.out.println( "size - "+nums.size());
        System.out.println(nums);
        System.out.println("index 0= " + nums.get(0));
        System.out.println("index 0= " + nums.get(1));
        System.out.println("index 0= " + nums.get(2));
        System.out.println("index 0= " + nums.get(3));


    }
}
