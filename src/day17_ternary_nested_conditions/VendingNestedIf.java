package day17_ternary_nested_conditions;

public class VendingNestedIf {
    public static void main(String[] args) {
        String selection ="drink";
        String drinkItem = "tea";
        String snack = "chips";
        if(selection.equals("drink")){
            System.out.println("Drink item is selected");
            if(drinkItem.equals("tea")) {
                System.out.println( drinkItem);
            } else {
                System.out.println("drink = coke");
            }
        }else if(snack.equals("chips")){
                System.out.println("snack = " + snack);
            }else {
                System.out.println("Wrong selection");
            }
        }

}
