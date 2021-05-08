package day34_void_methods;

public class FirstMethod {
    public static void main(String[] args) {
displayMessage();// Call the method
        displayMessage();
        displayMessage();
        for (int i = 1; i<=10 ; i++){
            System.out.print(i + "-");
            displayMessage();
        }
    }
    // first custom reusable method
    public static void displayMessage() {
        System.out.println("Hello b22 Friends");
    }
}
