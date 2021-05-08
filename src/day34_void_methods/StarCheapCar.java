package day34_void_methods;

public class StarCheapCar {
    public static void main(String[] args) {
        seatInCAR();
        startTheCar();
        shiftToDrive();
        pressGasPedal();
    }
    public static void seatInCAR(){
        System.out.println("1. Open the door and sit in the driver seat");
    }
    public static void startTheCar(){
        System.out.println("2. Insert key to ignition and turn clockwise");
    }
    public static void shiftToDrive(){
        System.out.println("3. Press brake pedal and shift to 'D' ");
    }
    public static void pressGasPedal() {
        System.out.println("4. Hold Steernig wheel with 2 hands and press gas pedal");
    }
}
