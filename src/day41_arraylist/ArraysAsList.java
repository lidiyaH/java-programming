package day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
    public static void main(String[] args) {
        //asList() is another method in Arrays class.
        //It will convert an array to arraylist
        List<Integer> nums = Arrays.asList(23, 1, 34, 54, 654);
        System.out.println("nums = "+ nums);
        // we can not do add or remove or clear
        // nums.add(100); unsupportedOperationException is when we use arrays
        //array.as will return immutable list, that size cannot modified.
        List<Integer> numslist = new ArrayList<>(Arrays.asList(4, 2, 5, 666, 77));
        numslist.add(33);
        numslist.add(56);
        System.out.println(numslist);
        numslist.remove(0);// index 0
        numslist.remove(new Integer(5));// remove number 5 not index
        System.out.println(numslist);

    }
}
