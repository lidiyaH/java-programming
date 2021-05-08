package day14_multi_branch_if_statements;

public class DayActivity {
    public static void main(String[] args) {
        String weather= "windy";
        if(weather.equals("sunny")) {
            System.out.println(weather + "- Go to park");
        }else if (weather.equals("rainy")) {
            System.out.println(weather + "- stay home");
        }else if (weather.equals("snow")) {
            System.out.println(weather + "-clean the car and build the snowman");
        }else if (weather.equals("windy")){
            System.out.println(weather + "- Get ready for power loss");}
    }
}
