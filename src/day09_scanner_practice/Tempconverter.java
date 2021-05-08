package day09_scanner_practice;
import java.util.Scanner;
public class Tempconverter {
    public static void main(String[] args) {
        System.out.println(" ********* F TO C ******** ");
        System.out.println("Enter Temperature in F");
        Scanner scan = new Scanner(System.in);
        double fahrenheit=scan.nextDouble();
        double Celsius = (fahrenheit - 32)*5/9;
        System.out.println("Fahrenheit to Celsius: " + Celsius);

    }
}
