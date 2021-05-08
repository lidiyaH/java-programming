package day19_class_vs_object_String_methods;

public class StringLength {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word);
        System.out.println("word = " + word.length());
        System.out.println(" count = " +word.length());
        System.out.println("wooden spoon".length());
        String firstName = "Lidiya";
        System.out.println(firstName + " - "+firstName.length());
        int count = firstName.length();
        System.out.println(count);
        String password = "abc123";
        if (password.length() >= 6){
            System.out.println("valid amazon password");
        }else {
            System.out.println("password too short");
        }
    }
}
