package day09_scanner_practice;
import java.util.Scanner;
public class SpeedCheckv1 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the current speed");
      int speedlimit= 55;
      int currentspeed= scan.nextInt();
      int overThelimit = currentspeed-speedlimit;
        System.out.println("you're driving "+overThelimit+"mph over the speed limit");
    }
}
