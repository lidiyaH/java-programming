package day17_ternary_nested_conditions;

public class AmazonPrimeShopping {
    public static void main(String[] args) {
       double itemPrice = 30;
       boolean isPrimeMmber = true;
       if (isPrimeMmber) {
           System.out.println("Eligible for free 2 day shipping");
       }else {
           if(itemPrice >= 25.0) {
               System.out.println("Eligible for free regular shipping");
           }else {
               System.out.println("Not eleigibel for free shipping.");
           }
       }
    }
}
