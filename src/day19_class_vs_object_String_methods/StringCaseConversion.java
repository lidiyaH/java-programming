package day19_class_vs_object_String_methods;

public class StringCaseConversion {
    public static void main(String[] args) {
        String word = "CyberTek";
        String sentence = "123 Java Is Fun!";
        System.out.println(word);
        System.out.println(word.toLowerCase());
        System.out.println("Java".toLowerCase());
        System.out.println(sentence.toLowerCase());
        word.toLowerCase();
        System.out.println(word);
        String wordInLcase = word.toLowerCase();
        System.out.println("wordInLcase = " + wordInLcase);
        word= word.toLowerCase();
        System.out.println("wordInLcase = " + wordInLcase);
        String companies = "Amazon ";
        System.out.println(companies.toUpperCase());
        System.out.println("company in uppercase - "+ companies.toUpperCase());
        System.out.println("java".toUpperCase());
        companies=companies.toUpperCase();
        System.out.println("companies = " + companies);

    }
}
