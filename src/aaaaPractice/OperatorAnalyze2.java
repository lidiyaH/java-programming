package aaaaPractice;

import java.util.Scanner;

public class OperatorAnalyze2 {
    public static void main(String[] args) {

        int a = 3;
        int y = ++a;
        byte c = (byte) a;
        System.out.println(a + " " + y + " " + y++ + " " + a++ + y + " " + --a);
        System.out.println(a + " " + y + " " + y++ + " " + a++ + y + " " + --a);
        Scanner scan = new Scanner(System.in);
        int cents;
        System.out.println("Enter cents:");
        cents = scan.nextInt();
        if (cents > 0 && cents < 100) {
            int qua = cents / 25;
            int lft= (cents % 25);
            int dim =  lft/ 10;
            lft = lft%10;
            int nic = lft/ 5;
            lft = lft%5;
            int pen = lft;
            System.out.println("Your change is " + qua + " quarters, " + dim + " dimes, " + nic + " nickels, and " + pen + " pennies");
        } else {
            System.out.println("Invalid cents amount");
        }
    }
}
