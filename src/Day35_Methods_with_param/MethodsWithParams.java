package Day35_Methods_with_param;

public class MethodsWithParams {
    public static void main(String[] args) {
        displayValue(10);
        displayValue(2);
        int count = 55;
        displayValue(count);
        greetByName("Lidiya");
        greetByName("Saim");
    }
    public static void displayValue(int num) {
        System.out.println("The value is "+ num);
    }
    public static void greetByName(String name) {
        System.out.println("Hellow "+ name + ", how are you today?");
    }

}
