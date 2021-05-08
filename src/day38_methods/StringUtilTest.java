package day38_methods;

public class StringUtilTest {
    public static void main(String[] args) {
        StringUtils.reverse("java");
        System.out.println();
        String userNamme= "";
        if (StringUtils.isNullOrEmpty(userNamme)){
            System.out.println("Fail: cannot be empty");
        }
    }
}
