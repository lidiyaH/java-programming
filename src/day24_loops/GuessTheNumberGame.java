package day24_loops;
import java.util.*;
public class GuessTheNumberGame {
    public static void main(String[] args) {
       Random rand = new Random();
       Scanner scan = new Scanner(System.in);
       int secretNumber = rand.nextInt(50);
       int guessingNumber=0;
       do {
           System.out.println("Guess the Secret number");
           guessingNumber = scan.nextInt();
           if (guessingNumber>secretNumber){
               System.out.println("Wrong Your number is too large");
           }else if (guessingNumber<secretNumber) {
               System.out.println("Wrong, Your number is too small");
           }
       }while (secretNumber!=guessingNumber);
        System.out.println("******Congratulation*****"+ secretNumber);
    }
}
