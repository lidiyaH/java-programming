package day42_arrayList;

import sun.jvm.hotspot.oops.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodWithList {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("java"); words.add("html");
        words.add("selenium"); words.add("a");
        words.add("input"); words.add("title");
        //pass the words list to printStrList Method
        printStrList(words);
        List<Integer> nums = Arrays.asList(23, 54, 355, 45,12);
        int s = sumIntegerList(nums);
        System.out.println("\nsum = " + s);

    }
    public static void printStrList(List<String> stringList){
        for (String str : stringList) {
            System.out.print(str + " ");
        }

    }
    public static int sumIntegerList (List<Integer> integerList) {
        int sum = 0;
        for (int i: integerList) {
            sum += i;
        }
        return sum;
    }
}
