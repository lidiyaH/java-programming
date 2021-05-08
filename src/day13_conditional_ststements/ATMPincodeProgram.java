package day13_conditional_ststements;

public class ATMPincodeProgram {
    public static void main(String[] args) {
        System.out.println("***WELCOME TO TD BANK ATM***");
        int secretpincode= 1234;
        int inputpincode = 1234;
        if (secretpincode == inputpincode) {
            System.out.println("Welcome to your account.");
            System.out.println("You can withdraw, check your balance, deposit");
        }else {
            System.out.println("Incorrect pincode!   " + inputpincode);}
    }
}
