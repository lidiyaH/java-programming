package day28_loops;

public class BreakvsContinue {
    public static void main(String[] args) {
        for (int n = 1; n <= 5; n++) {
            if(n==1 || n==3) {
                //if (n == 3) {
                // break;
                continue;
            }
            System.out.println(n);
            }
    }
}
