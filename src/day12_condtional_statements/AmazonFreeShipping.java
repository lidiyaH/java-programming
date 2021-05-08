package day12_condtional_statements;
import java.util.Scanner;
public class AmazonFreeShipping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your order total price");
        double totalPrice = scan.nextDouble();
        if (totalPrice > 25) {
            System.out.println("Free shipping eligible. your order total= $"+ totalPrice);
        } else {
            System.out.println("Free shipping not eligible");
        }
        System.out.println("***Thank You for Shopping at Amazon***");

    }
}
