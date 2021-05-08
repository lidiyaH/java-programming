package day40_arrayList;

import java.util.*;

public class ArrayListLoop {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        System.out.println(nums);
        System.out.println("size -" + nums.size());
        nums.add(34);nums.add(44);nums.add(88);nums.add(3);
        nums.add(340);nums.add(4);nums.add(45678);nums.add(0);
        System.out.println("num =" + nums);
        nums.remove(0);
        System.out.println(nums);
        for(int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i) +" ");
        }
        for(int each : nums) {
                System.out.print(each + " ");
        }
    }
}
