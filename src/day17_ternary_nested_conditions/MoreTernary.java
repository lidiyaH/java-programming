package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate = 50;
        String reply = (hourlyRate > 45) ? "accept" : "reject";
        System.out.println("reply = " + reply);
        String todayclass= "java";
        String teacher = (todayclass.equals("java"))? "Murodil/Saim" : "Nadir";
        System.out.println("teacher = " + teacher);
        boolean isEligibleDrive = true;
        String driving = (isEligibleDrive=true)? "yes, have DL, Can drive" : "No DL, cannot drive";
        System.out.println("driving = " + driving);
    }
}
