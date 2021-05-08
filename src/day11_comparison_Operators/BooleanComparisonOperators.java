package day11_comparison_Operators;

import sun.jvm.hotspot.gc_implementation.parallelScavenge.PSYoungGen;

public class BooleanComparisonOperators {
    public static void main(String[] args) {
        System.out.println(10 == 10 );
        System.out.println(1000 > 100);
        System.out.println(985.44 < 98547.3);
        System.out.println(10 <= 11);// less than or equal to
        System.out.println(5>=3);// is greater than or equal to
        System.out.println(-100 != 44);//is not


        int a = 100;
        int b = 200;
        System.out.println(a==b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a != b);
        boolean result;
        result = 5 == 5;
        System.out.println("result = " + result);
        result = 33 > 44;
        System.out.println("result = " + result);
        String name = "Nadir";
        boolean checkName = name == "Nadir";
        System.out.println(checkName);
        int age = 2;
        boolean nmtoddler = age > 3;
        System.out.println(nmtoddler);

    }
}
