package day16_switch_ternary;

public class AdairApartments {
    public static void main(String[] args) {
        int numberofBedrooms = 5;
        double startingPrice = 0;
        System.out.println("####### WELCOME TO ADAIRE APARTMENTS ###");
        switch(numberofBedrooms) {
            case 0:
                startingPrice = 1454;
                System.out.println("Studio apartment selected");
                System.out.println(startingPrice);
                break;
            case 1:
                startingPrice = 1725;
                System.out.println("one apartment selected");
                System.out.println(startingPrice);
                break;
            case 2:
                startingPrice = 2899;
                System.out.println("Two apartment selected");
                System.out.println(startingPrice);
                break;
            default:
                System.out.println(numberofBedrooms + " bedroom currently unavailable ");
                break;
        }
    }
}
