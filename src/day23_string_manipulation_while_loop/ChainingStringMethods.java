package day23_string_manipulation_while_loop;

public class ChainingStringMethods {
    public static void main(String[] args) {
        String word = "Wooden spoon";
        System.out.println(word.toUpperCase().toLowerCase().length());
        System.out.println(word.replace(" ","").toUpperCase());
        String city = "chicago";
        System.out.println(city.substring(0,1).toUpperCase()+city.substring(1));
        city="ISTANBUL";
        System.out.println(city.substring(0,1)+city.substring(1).toLowerCase());

    }
}
