package day36_methods_with_return;

import java.util.Random;

public class Info {
    public static void main(String[] args) {
        fullname();
        System.out.println(fullname());
        System.out.println(ismarrried());
        System.out.println(getAge());
        System.out.println(getRandomYear());
        if (ismarrried()) {
            System.out.println("married");
        }else {
            System.out.println("unmarried");
        }

    }
    public static String fullname() {
        //System.out.println("inside full method");
        return "Mike Smith";
    }
    public static boolean ismarrried() {
        return false;
    }
    public static int getAge() {
        return 35;
    }
    public static int getRandomYear() {
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;

    }


}
