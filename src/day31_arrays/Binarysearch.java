package day31_arrays;

import java.util.Arrays;

public class Binarysearch {
    public static void main(String[] args) {
        int[] nums = {123, 3456, 34555, 67788};
        System.out.println(Arrays.binarySearch(nums, 123));
        System.out.println(Arrays.binarySearch(nums, 3456));
        System.out.println(Arrays.binarySearch(nums, 23));
        System.out.println(Arrays.binarySearch(nums, 3455));
        System.out.println(Arrays.binarySearch(nums, 677889));
        System.out.println(Arrays.binarySearch(nums, 0));
        if(Arrays.binarySearch(nums,3456) >=0){
            System.out.println("12345 is peresent in array");
        }else {
            System.out.println("12345 is not present");
        }
    }
}
