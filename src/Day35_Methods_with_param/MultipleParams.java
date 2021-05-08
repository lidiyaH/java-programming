package Day35_Methods_with_param;
import java.util.*;
public class MultipleParams {
    public static void main(String[] args) {
        Random ran = new Random(100);
        double ra1 = ran.nextDouble();
        double ra2 = ran.nextDouble();
        showSum(ra1,ra2);
        Scanner scan = new Scanner(System.in);
        double n1 = scan.nextDouble();
        double n2 = scan .nextDouble();
        showSum(n1,n2);
    }
    public static void showSum(double num1, double num2) {
        System.out.print(num1 +" + "+num2);
        double sum = num1 + num2;
        System.out.println("= "+ sum );

    }
}
