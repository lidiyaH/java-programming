package day14_multi_branch_if_statements;

public class Calculatorv1 {
    public static void main(String[] args) {
        int num1=4;
        int num2=2;
        char operator = '/';
        if (operator == '+'){
            System.out.println(num1 + num2);}
        else if (operator == '-'){
            System.out.println(num1-num2);}
        else if (operator == '*'){
            System.out.println(num1*num2);}
        else if (operator == '/'){
            System.out.println(num1/num2);}
        else {
            System.out.println("****invalid operator****");}
    }
}
