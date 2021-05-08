package day33_arrays;

import java.util.Arrays;

public class RevereArray2 {
    public static void main(String[] args) {
        int[] nums = {5, 10, 4, 100};
        //int temp = nums[0];
       // nums[0] = nums[3];
        //nums[3] = temp;
        System.out.println("Before: "+ Arrays.toString(nums));
        for(int i = 0; i < nums.length/2;i++){
            int temp2 = nums[i];
            nums[i] = nums[nums.length-1-i];
            nums[nums.length-1-i] = temp2;
        }
        System.out.println("After "+ Arrays.toString(nums));
        String[] words = {"java", "html", "js", "ruby", "css"};
        System.out.println("before reverse words = " + Arrays.toString(words));
        for (int i = 0, j = words.length-1; i<words.length/2; i++,j-- ){
            String tempWord = words[i];
            words[i] = words[j];
            words[j] = tempWord;
        }
        System.out.println("words After = " + Arrays.toString(words));
    }
}
