package day36_methods_with_return;

public class calculator {
    public static void main(String[] args) {
        System.out.println("sum = "+ add(4.5,5.6));
        double sum = add(5,7);
        System.out.println(sum);
        System.out.println(add(5,6));
        System.out.println(minus(9,5));
        System.out.println(multibly(8,4));
        System.out.println(divide(40,5));
    }
    public static double add(double num1, double num2){
        double result = num1 + num2;
        return result;
    }
    public static double minus(double num1, double num2){
        double result = num1 - num2;
        return result;
    }
    public static double multibly(double num1, double num2) {
        double result = num1 * num2;
        return result;
    }
    public static double divide(double num1, double num2) {
        double result = num1 / num2;
        return result;
    }
}
