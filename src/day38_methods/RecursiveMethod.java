package day38_methods;

public class RecursiveMethod {
    public static void main(String[] args) {
        printsNums(1);
    }
    public static void printsNums(int num) {
        System.out.print(num + " ");
        num++;
        if (num<=100) {
            printsNums(num);
        }
    }
}
