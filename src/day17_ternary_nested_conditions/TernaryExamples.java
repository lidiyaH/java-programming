package day17_ternary_nested_conditions;

public class TernaryExamples {
    public static void main(String[] args) {
        int score=75;
        String result;
        if (score > 60){
            result = "pass";
        } else {
            result = "fail";
        }
        System.out.println("result = " + result);
        int score1 = 88;
        String result1 = (score>60)?"pass" : "fail";
        System.out.println("result1 = " + result1);
        String quality = "good";
        int rating = quality.equals("good") ? 100 : 0;
        System.out.println("rating = " + rating);
        int score3=100;
        char grade = (score3 > 90) ? 'A':'B';
        System.out.println("grade = " + grade);

    }
}
