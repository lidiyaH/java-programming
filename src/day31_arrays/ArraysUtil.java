package day31_arrays;
import  java.util.Arrays;
import java.util.Collections;

public class ArraysUtil {
    public static void main(String[] args) {
        int[] nums ={100, 5, 1, 7, 0, -4, 44, 33};
        // print all nums in same line
        System.out.println(Arrays.toString(nums));
        // sort nums
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("min value: "+ nums[0]);
        System.out.println("max value: "+ nums[nums.length-1]);
        //Arrays.sort(nums, collections.reverseorder());
        String[] words = {"java", "c#", "c++", "kotlin", "python", "Ruby", "Assembly"};
        System.out.println(Arrays.toString(words));
        System.out.println("["+String.join(", ",words)+"]");
        //sort words in alphabetic and ASCII order
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));
        //
        Arrays.sort(words, Collections.reverseOrder());
        System.out.println(Arrays.toString(words));
    }
}
