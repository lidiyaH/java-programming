package day19_class_vs_object_String_methods;

import java.util.Locale;

public class CheckCaseMatch {
    public static void main(String[] args) {
        String countrycode = "UG";
        if (countrycode.equals(countrycode.toUpperCase())){
            System.out.println("pass - case is correct");
        }else {
            System.out.println("Fail - case is incorrect");
        }
    }
}
