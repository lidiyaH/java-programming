package day13_conditional_ststements;

public class IFWithBooleanVariable {
    public static void main(String[] args) {
        Boolean isHungry = true;
        if (isHungry == true) {
            System.out.println("I am Hungry, I will go get something to eat");
            System.out.println("Then let's code Java");
        }else{
            System.out.println("I am not Hungry! I will keep coding java");
        }
        double price = 130.44;
        boolean isAffordable = price <=200.0;
        System.out.println("isAffordable = " + isAffordable);
        if (isAffordable) {
            System.out.println("Too expensive, lets keep coding java");
        }else{
            System.out.println("Too expensive, lets keep coding Java");
        }
        boolean isRemoteJob = true;
        if (isRemoteJob = true) {
            System.out.println("sorry, I am not interested");
        } else {
            System.out.println("sure, I am interested, what is interview process");
        }
    }
}
