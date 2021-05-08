package day34_void_methods;

public class etsySearchTest {
    public static void main(String[] args) {
        System.out.println("--Starting Etsy Search smoke Test---");
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        v();
        System.out.println("--Etsy search smoke test completed-- ");
    }
    public static void openBrowser() {
        System.out.println("launching Chrome browser");
    }
    public static void navigateToEtsyUrl(){
        System.out.println("Navigate to https://www.etsy.com/");
    }
    public static void searchForWoodenSpoon() {
        System.out.println("Pass: Verify Etsy home page is displayed");
        System.out.println("Type: Wooden spoon in search fiels and click search");
    }
    public static void v() {
        System.out.println("PASS: search result are successfully displayed");
    }
}
