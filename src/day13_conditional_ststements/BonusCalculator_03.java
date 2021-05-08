package day13_conditional_ststements;

public class BonusCalculator_03 {
    public static void main(String[] args) {
        double bonus;
        double salesAmount = 2000.55;
        if (salesAmount <= 1000) {
            System.out.println("Good job, you qualified for the bonus");
            bonus = 50;
        } else {
            System.out.println("Great job, you are qualified to the full bonus amount");
            bonus = 100;
        }
        System.out.println("your total bonus : $" + bonus);
    }
}
