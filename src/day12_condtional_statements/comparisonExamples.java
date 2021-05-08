package day12_condtional_statements;

public class comparisonExamples {
    public static void main(String[] args) {
        int speedLimit = 5_5;
        int currentSpeed = 4_5;
        System.out.println(currentSpeed > speedLimit);
        System.out.println(speedLimit < currentSpeed);
        boolean isSpeeding = currentSpeed > speedLimit;
        System.out.println("isSpeeding = " + isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed);
        System.out.println("speedLimit = " + speedLimit);
        currentSpeed += 20;
        isSpeeding = currentSpeed > speedLimit;
        System.out.println("currentSpeed = " + currentSpeed);
        System.out.println("speedLimit = " + speedLimit);
        System.out.println("isSpeeding = " + isSpeeding);
        double accountBalance = 250.25;
        double itemPrice = 100.99;
        System.out.println("can I afford?- " + (accountBalance >= itemPrice));
        boolean canAfford = accountBalance >= itemPrice;
        System.out.println("canAfford = " + canAfford);

        //decrease balance by itemPrice. Using shorthand operator

        accountBalance = accountBalance - itemPrice;
        accountBalance -= itemPrice;

        boolean isBroke = accountBalance <= 0;
        System.out.println("Am I Broke = " + isBroke);



    }
}
