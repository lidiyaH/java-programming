package day17_ternary_nested_conditions;

public class TeslaNestedIf {
    public static void main(String[] args) {
        char model = 'S';
        String trim = "Long range";
        if(model=='S'){
            System.out.println("model selected");
            if(trim.equals("long range"));
        }
    }
}
