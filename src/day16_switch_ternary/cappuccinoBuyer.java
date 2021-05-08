package day16_switch_ternary;

public class cappuccinoBuyer {
    public static void main(String[] args) {
        String size = "tall";
        double price = 0;
        double calories = 0;
        switch (size) {
            case "tall":
                System.out.println("Tall cappuccino please");
                price=3.69; calories = 90;
                System.out.println("$"+price);
                System.out.println(calories);
                break;
            case "grande":
                System.out.println("grande cappuccino please");
                price=3.99; calories = 120;
                System.out.println(price);
                System.out.println(calories);
                break;
            case "venti":
                price=3.29; calories = 150;
                System.out.println("venti cappuccino please");
                System.out.println(price);
                System.out.println(calories);
                break;
            default:
                System.out.println("not valide");
                break;
        }
        System.out.println("total price " + price);
    }
}
