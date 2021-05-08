package day18_conditions_practice_string_into;

public class scoreRangeTest {
    public static void main(String[] args) {
        int score=65;
        if (score>= 1 && score>=40){
            System.out.println("D");
        }else if (score>=41 && score<=60){
            System.out.println("C");
        }else if (score>=61 && score<=90) {
            System.out.println("B");
        }else if (score>=91 && score<=100) {
            System.out.println("A");
        }
    }
}
