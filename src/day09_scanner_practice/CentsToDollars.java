package day09_scanner_practice;
import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("please enter the cents");
        int cents = scan.nextInt();
        int dollars = cents/100;
        int remainingcents = cents%100;
        System.out.println(dollars);
        System.out.println("remainingcents = " + remainingcents);
        System.out.println("In "+ cents+ " cents: "+ dollars +"$"+ " and "+ remainingcents + " cents");
    }
}
