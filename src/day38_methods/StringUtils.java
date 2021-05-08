package day38_methods;

public class StringUtils {
    public static void main(String[] args) {
        System.out.println(isNullOrEmpty("isNull" + isNullOrEmpty("hello")));
String word = null;
        System.out.println("isNullOrEmpty(word) = " + isNullOrEmpty(word));
    }
    public static boolean isNullOrEmpty(String str) {
        if(str == null || str.isEmpty()){
            return true;
        }
        return false;
    }
    public static boolean isPalindrome(String str){
        str = str.toLowerCase();
        for(int i = 0; i< str.length()/2; i++ ){
            if (str.charAt(i) != str.charAt(str.length()-1-i)) {
               return false;
            }
        }
        return false;
    }
    public static void reverse(String str){
        String reversed = "";
        for(int i = str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
        return;
    }
}
