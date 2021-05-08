package day15_logicalops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true = " + !true);
        int age = 2;
        if (!(age > 7)) {
            System.out.println("Need to sit in child car seat. age = " + age);
        } else {
            System.out.println("Can sit normal seat");
        }
        boolean isSmokingAllowed = false;

        if (!isSmokingAllowed) {
            System.out.println("Smoking is not allowed here. Exit");
        } else {
            System.out.println("this area is for smoking");
        }
        boolean isAffordable = true;
        if (!isAffordable){
            System.out.println("I cant afford");
    }
        String env = "qa";
        if (!env.equals("qa")){
            System.out.println("In wrong environment for qa testing");
        }
        String carModel = "Tesla";
        if(!carModel.equals("Tesla"));{
            System.out.println("Not interested, thank you");
        }
        String secretPassword = "abc123";
        String inputPassword = "abc321";
        if (!inputPassword.equals(secretPassword)){
            System.out.println("incorrect Password");
        }
}}
