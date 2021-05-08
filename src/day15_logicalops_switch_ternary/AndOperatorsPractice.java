package day15_logicalops_switch_ternary;

public class AndOperatorsPractice {
    public static void main(String[] args) {
        boolean onsale = true;
        boolean freeshipping = true;
        String itemName = "wooden spoon";
        if (onsale && freeshipping) {
            System.out.println("Adding to cart  " + itemName);
        } else {
            System.out.println("continue  shopping for good deals");
        }
    }
}
