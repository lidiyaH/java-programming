package Day35_Methods_with_param;

import java.util.Locale;

public class Email {
    public static void main(String[] args) {
        buildEmail("Saim", "cybertekschool");
        buildEmail("lidiya", "gmail");
        buildEmail("john ward III".toLowerCase().replace(" ","_"),"verizon");
    }
    public static void buildEmail(String name, String domain) {
        System.out.println("Email: "+ name+"@"+domain+".com");
    }
}
