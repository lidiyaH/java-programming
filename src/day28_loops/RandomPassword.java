package day28_loops;

import java.util.Random;

public class RandomPassword {
    public static void main(String[] args) {
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcddefghigjklmnopqrstuvwxyz0123" +
                "4567890!@#$%^&*()_+";
        Random random = new Random();
        String password = "";
        for (int i = 1; i <= 8; i++) {
            int index = random.nextInt(71);
            System.out.print(source.charAt(index));
            //System.out.print(" "+random.nextInt(source.length()));
            // source.substring(index, index + 1);
            password+= source.charAt(index);
        }
        System.out.println("\n your password = "+ password);
    }
}
