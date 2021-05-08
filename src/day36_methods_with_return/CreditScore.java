package day36_methods_with_return;

public class CreditScore {
    public static void main(String[] args) {
        checkEligible(757);
        System.out.println(getCredit());
        System.out.println("Credit score = "+ getCredit());
        int score= getCredit();
    }
    public static void checkEligible(int creditScore) {
        if (creditScore >=700){
            System.out.println("You are eligible for leasing this car");
        }else {
            System.out.println("Sorry, Your are not eligible for leasing this car");
        }
    }
    public static int getCredit() {
        return 800;
    }
}
