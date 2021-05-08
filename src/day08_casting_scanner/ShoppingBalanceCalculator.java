package day08_casting_scanner;

public class ShoppingBalanceCalculator {
    public static void main(String[] args) {
        double price = 20.88;
        double price2= 89.99;
        double price3= 15;
        double balance = 345.55;
        double remainingBalance = (balance - (price + price2 + price3));
        System.out.println(remainingBalance);
        int blanaceWithNoCents= (int)remainingBalance;
        System.out.println("Your remainaing balance without cents:  "+blanaceWithNoCents);
    }
}
