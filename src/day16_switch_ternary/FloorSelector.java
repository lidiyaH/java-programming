package day16_switch_ternary;

public class FloorSelector {
    public static void main(String[] args) {
        int floorNum = 7;
        if(floorNum == 1) {
            System.out.println("floor 1 selected : companies Lobby Verizon, Starbucks");
        }else if (floorNum == 2) {
            System.out.println("floor 1 selected : companies cyber NASA Intelsat");
        } else if(floorNum == 3) {
            System.out.println("floor 1 selected : companies lyft, bota");
        } else {
            System.out.println(" Invalid");
        }
        System.out.println("***** SWITCH STATEMENT VERSION*******");
        floorNum = 1;
        switch (floorNum) {
            case 1:
                System.out.println("Floor 1 selected, companies: Lobby, verison, Starbucks");
                break;
            case 2:
                System.out.println("Floor 2 selected Companies: Cybertek,");
                break;
            case 3:
                System.out.println("Floor 3 selected, companies: Lyft, BOfa Stake house");
                break;
            default:
                System.out.println("Invalid flooor - " + floorNum);
                break;
        }
    }
}
