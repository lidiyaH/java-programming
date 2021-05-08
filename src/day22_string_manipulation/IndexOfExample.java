package day22_string_manipulation;

public class IndexOfExample {
    public static void main(String[] args) {
        String technology = "java, html, css, selenium, testing , maven, cucumber";
        System.out.println(technology.indexOf(","));
        System.out.println(technology.lastIndexOf(","));
        int indexOfJava = technology.indexOf("java");
        System.out.println("java is at index "+ indexOfJava);
        int inxOfCcs = technology.indexOf("css");
        System.out.println("index of CSS"+ inxOfCcs);
        int indexOfcUCUMBER = technology.indexOf(("cucumber"));
        System.out.println(indexOfcUCUMBER);
        int indexOfSQL = technology.indexOf("sql");
        System.out.println(indexOfSQL);
    }
}
