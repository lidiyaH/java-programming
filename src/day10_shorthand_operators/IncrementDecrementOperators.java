package day10_shorthand_operators;

public class IncrementDecrementOperators {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("i = " + i);
        i++;
        System.out.println("i= " + i);
        i++;
        i++;
        ++i;
        ++i;
        System.out.println("i = " + i);

        int LinesOfCode = 15;
        System.out.println("LinesOfCode = " + LinesOfCode);
        LinesOfCode++;
        LinesOfCode += 1;
        LinesOfCode = LinesOfCode + 1;
        System.out.println("LinesOfCode = " + LinesOfCode);

        char letter = 'a';
        System.out.println("letter = " + letter);
        letter++;
        System.out.println("letter = " + letter);
        letter++;
        System.out.println("letter = " + letter);
        letter++;
        System.out.println("letter = " + letter);
        letter--;
        System.out.println("letter = " + letter);
        int num1 = 50;
        int num2=200;
        num2=num1;
        System.out.println("num2 = " + (1)+(2));
        
      long a=3000L;
      long b=(short)a;

        long c=3000L;
        short x=(short)c;
        long d=x;

    }
}
