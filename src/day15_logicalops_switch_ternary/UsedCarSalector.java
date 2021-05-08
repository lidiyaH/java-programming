package day15_logicalops_switch_ternary;

public class UsedCarSalector {
    public static void main(String[] args) {
        double budget = 5000;
        String model = "Toyota";
        double carprice = 4500.0;
        if (carprice >= budget && model.equals("Toyota") || model.equals("Honda")) {
            System.out.println("Ready to purchase model = " + model + "price = " + carprice);
        }else {
            System.out.println("Not interested ");
        }

    }
}
