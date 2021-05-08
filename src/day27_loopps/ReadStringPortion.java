package day27_loopps;

public class ReadStringPortion {
    public static void main(String[] args) {
        String list = "cat,car,cat,red_car,java,selenium";
        for (int i = 0; i<list.length()-2;i++){
            System.out.print(list.substring(i, i+3));
            System.out.print(" ");
        }
    }
}
