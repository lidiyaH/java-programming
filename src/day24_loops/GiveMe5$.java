package day24_loops;
import java.util.*;
public class GiveMe5$ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the dollar: ");
        int dollar = scan.nextInt();
        while (dollar != 5){
            System.out.println("give me 5 dollar");
            dollar =  scan.nextInt();
        }
        System.out.println("Thank you for $5");
    }
}
