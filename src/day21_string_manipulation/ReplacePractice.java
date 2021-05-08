package day21_string_manipulation;

public class ReplacePractice {
    public static void main(String[] args) {
        String word = "githab";
        System.out.println(word.toUpperCase());
        System.out.println(word.contains("i"));
        System.out.println(word.replace("hab","lab"));
        System.out.println(word);
        word = word.replace("hub","lab");
        System.out.println(word.replace('i','o'));
        String sentence= "java is fun";
        String withNoSpaces = sentence.replace(" ","");
        System.out.println(withNoSpaces);
        String result  = "1-48 of over 4,000 results for java book";
         result = result.replace("1-48 of over ","");
        result = result.replace(" results for java book","");
        System.out.println(result);
    }
}
