package day19_class_vs_object_String_methods;

public class StringStartsEndsWith {
    public static void main(String[] args) {
        String word = "intellij idea";
        System.out.println(word.startsWith("i"));
        String firstname = "Dr. Nadir";
        if (firstname.startsWith("Mr.")){
            System.out.println("man");
        }else if (firstname.startsWith("Dr.")){
            System.out.println("Doctor");
        }else if (firstname.startsWith("Mrs")){
            System.out.println("Married Woman");
        }else if (firstname.startsWith("Ms")){
            System.out.println("Single Woman");
        }else if (firstname.startsWith("Sr.")){
            System.out.println("Senior");
        }else{
            System.out.println("Norman man");
        }
        String url = "lidiya.com";
        if (url.endsWith(".com")){
            System.out.println("commericial website");
        }else if (url.endsWith(".ru")){
            System.out.println("Russian website");
        }else if (url.endsWith(".edu")){
            System.out.println("Education website");
        }
    }
}
