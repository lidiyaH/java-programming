package aaaaPractice;

import java.util.Scanner;

public class replit {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE:
        String item1;
        String item2;
        String item3;
        String report;
        double price1;
        double price2 ;
        double price3;
        double totalprice;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Item1 and its price:");
        item1 = scan.nextLine();
        //scan.next();
        //System.out.println();
        price1 = scan.nextDouble();

        System.out.println("Enter Item2 and its price:");
        scan.next();
        item2 = scan.nextLine();
        //System.out.println();
        price2 = scan.nextDouble();

        System.out.println("Enter Item3 and its price:");
        scan.next();
        item3 = scan.nextLine();
       // System.out.println();
        price3 = scan.nextDouble();
        totalprice = (price1 + price2 + price3);
        report = "Item1: "+item1+" price: "+price2+", "+"Item2: "+item2+" price: "+price2+", "+"Item3: "+item3+" price: "+price3;
        System.out.println(report);
        System.out.println("Total price: "+totalprice);
    }
}
