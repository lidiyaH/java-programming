package day18_conditions_practice_string_into;

public class Authentication {
    public static void main(String[] args) {
        int last4SSN = 4444;
        int pinCode = 1234;
        int expPinCode= 4544;
        int expPincode=1234;
        if (expPinCode==last4SSN && expPincode==pinCode) {
            System.out.println("Authentication successful");
        }else if (expPinCode!=last4SSN && expPincode==pinCode){
                System.out.println("Last 4 of SSN did not match");
        }else if (expPinCode==last4SSN && expPincode!=pinCode){
                System.out.println("Pincode did not match");
            }
        }
    }
