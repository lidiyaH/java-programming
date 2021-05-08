package day28_loops;

public class JavaCityCases {
    public static void main(String[] args) {
        int totalCases = 0;
        for(int day = 1; day<=30; day++){
            if(day %7==0) {
                totalCases+= 500;
                System.out.println(day +" Sunday-"+totalCases);
            }else
                totalCases+=200;
                System.out.println(day +" Weekday-"+ totalCases);
            }
        System.out.println("total cases in day 30 "+ totalCases);
        }
    }
