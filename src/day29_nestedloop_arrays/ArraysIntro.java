package day29_nestedloop_arrays;

public class ArraysIntro {
    public static void main(String[] args) {
       int num = 10; // single variable
        // Array Variable
        int[] nums = new int[3];
        nums[0] = 5;
        nums[1] = 10;
        nums[2] = 7;
        System.out.println("value at index of 0 = " + nums[0]);
        System.out.println("value at index of 1 = " + nums[1]);
        System.out.println("value at index of 2 = " + nums[2]);
// We can also use int variable to specify index number
         int i = 0;
        System.out.println("nums[i] = " + nums[i]);
        i++;
        System.out.println("nums = " + nums[i]);
        System.out.println("number of elements" + nums.length);
        int lan = nums.length;
        nums[0] = 100;
        nums[1]= 200;
        nums[2] = nums[1];
        System.out.println(nums[0] +" "+ nums[1]+" "+ nums[2]);


         
    }
}
