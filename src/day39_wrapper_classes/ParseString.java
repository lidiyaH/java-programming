package day39_wrapper_classes;

public class ParseString {
    public static void main(String[] args) {
        String total = "4345";
        int num = Integer.parseInt(total);
        System.out.println(num);

        String numstr = "23456";
        int ns = Integer.parseInt(numstr);
        System.out.println(ns);

        String strPrice = "123.5";
        double price = Double.parseDouble(strPrice);
        if (price > 100){
            System.out.println("expensive");
        }
        String sentence = "I wrote 100 lines of code";
        String[] sentences = sentence.split(" ");
        int linesofCode = Integer.parseInt(sentences[2]);
        System.out.println(linesofCode);


    }
}
