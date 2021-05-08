package day09_scanner_practice;


public class SalaryCalculator {
    public static void main(String[] args) {
        System.out.println("Enter hourly rate");
        double hourlyRate = 54.5;
        double weeklypay= hourlyRate*40;
        double monthlypay = weeklypay*52/12;
        double annualpay= monthlypay * 12;
        System.out.println("weekly pay: "+ weeklypay);
        System.out.println("Monthly pay: "+ monthlypay);
        System.out.println("Annual pay: "+ annualpay);


    }
}
