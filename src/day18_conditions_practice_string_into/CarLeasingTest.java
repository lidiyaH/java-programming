package day18_conditions_practice_string_into;

public class CarLeasingTest {
    public static void main(String[] args) {
        String make = "Mercedes";
        String model = "E";
        double leaseprice = 0.0;
        if (make.equals("Mercedes") && model.equals("E")) {
            leaseprice = 500.0;
        }else if (make.equals("Mercedes") && model.equals("E")){
            leaseprice= 400.0;
        }
        System.out.println("make = " + make);
        System.out.println("model = " + model);
        System.out.println("leaseprice = " + leaseprice);
    }
}
