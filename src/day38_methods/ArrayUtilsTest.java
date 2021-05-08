package day38_methods;

import day31_arrays.ArraysUtil;

import java.util.Arrays;

public class ArrayUtilsTest {
    public static void main(String[] args) {
        int[] nums = {5, 23, 1, 543, 90};
        ArrayUtils.printArray(nums);
        ArrayUtils.printArray(new int[] {23, 64, 23, 534, 45, 234, 45});
        System.out.println(ArrayUtils.sum(nums));
        ArrayUtils.printArray(new int[]{23,64,23,534,234,45,234,45});
    }


}
