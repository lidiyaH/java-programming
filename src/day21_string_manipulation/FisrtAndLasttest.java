package day21_string_manipulation;

public class FisrtAndLasttest {
    public static void main(String[] args) {
        String word = "mom";
        char first = word.charAt(0);
        char last = word.charAt(2);
        if (first == last) {
            System.out.println("same");
        } else
            System.out.println("diffrent");
        String name = "aziza";
        char firstletter = name.charAt(0);
        char lastletter = name.charAt(name.length()-1);
        System.out.println(firstletter);
        System.out.println(lastletter);

    }
}
