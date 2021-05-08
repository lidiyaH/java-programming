package day01_intro_to_programming;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("HelloWorld");
        int [] num1 = new int[3];
        int [] num2 = {1,2,3,4};
        num1 = num2;
        for (int i = 0; i < num1.length; i++) {
            System.out.println(num1[i]);
        }

    }
}
