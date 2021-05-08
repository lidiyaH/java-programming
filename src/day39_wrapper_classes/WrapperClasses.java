package day39_wrapper_classes;

public class WrapperClasses {
    public static void main(String[] args) {
        int num = 100;
        System.out.println("num = "+ num);
        num += 10;
        System.out.println(num);
        Integer n = new Integer(500);
        System.out.println("is n 500? = " + n.equals(500));
        System.out.println(n + 300);
        Integer n2 = 1000;
        System.out.println(n2/50);
        // Convert n2 to string
        String numStr = n2 + " ";
        String numst = n2.toString();
        System.out.println(numStr);
        System.out.println(numst);


        Byte b1 = new Byte((byte)5);
        Byte b2 = 10;

        Short sh1 = new Short((short)40);
        Short sh2 = 50;

        Integer i1 = new Integer(100);
        Integer i2 = 200;

        Long l1 = new Long(300L);
        Long l2 = 3455L;

        Float fl1 = new Float(5.2F);
        Float fl2 = 45.3F;

        Double d1 = new Double(345.3);
        Double d2 = 234.5;

        Character ch1 = new Character('Q');
        Character ch2 = 'V';

        Boolean bl1 = new Boolean(true);
        Boolean bl2 = false;

        System.out.println(Integer.max(10,5));
        System.out.println(Integer.sum(50,35));
        System.out.println(Integer.min(5,2));
        System.out.println("MAX INT: " + Integer.MAX_VALUE);
        System.out.println("MIN INT: " + Integer.MIN_VALUE);
        System.out.println(Double.max(234.4, 23.9));
        System.out.println("MIN DOUBLE :" + Double.MIN_VALUE);
        System.out.println(Double.compare(5,1));
        System.out.println(Double.compare(5,5));
        System.out.println(Double.compare(1,5));
        System.out.println(Character.isDigit('8'));
        System.out.println(Character.isDigit('v'));
        System.out.println(Character.isAlphabetic('V'));
        System.out.println(Character.isLetter('r'));
        System.out.println(Character.isLetter('9'));
        char letter = 'A';
        if (Character.isUpperCase(letter)) {
            System.out.println("It is uppercase");
        }
        String word = "JaVa is FuN";
        for (int i = 0; i<=word.length()-1; i++) {
            if(Character.isUpperCase(word.charAt(i))){
                System.out.print(word.charAt(i));
            }
        }

    }
}
