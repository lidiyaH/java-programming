package day11_comparison_Operators;

public class prePostIncrementDecrementOperators {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = ++num1;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        num2=num1++;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        int num3=8;
        int num4= num3++;
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        int apples= 10;
        int basket = ++apples;
        System.out.println("apples = " + apples);
        System.out.println("basket = " + basket);
        int kiwi = 15;
        int kiwibasket= kiwi++;
        System.out.println("kiwi = " + kiwi);
        System.out.println("kiwibasket = " + kiwibasket);
        int m= 44;
        m++;
        System.out.println("m = " + m);
        int a = 50;
        int b = 22;
        int c = a++ + ++b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);


    }
}
