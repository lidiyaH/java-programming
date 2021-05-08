package day12_condtional_statements;

public class compareChars {
    public static void main(String[] args) {
        char letter = 'A';
        char letter2 = 'J';
        System.out.println(letter == letter2);
        System.out.println(letter > letter2);
        System.out.println(letter2 > letter);

        char grade = 'E';
        boolean pass= grade <= 'D';
        System.out.println("Did you pass the exam? " + pass);
    }
}
