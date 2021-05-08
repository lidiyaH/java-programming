package day32_arrays_split;

public class SenteneceSplit {
    public static void main(String[] args) {
        String sentence = "Java is Fun";
        String[] words = sentence.split(" ");
        System.out.println("1st word= "+ words[0]);
        System.out.println("2nd word= "+ words[1]);
        System.out.println("3rd word= "+ words[2]);
        for(String w : words) {
            System.out.println(w);
        }
        String googleResult = "About 1,810,000 results (0.68 seconds)";
        String[] results = googleResult.split(" ");
        System.out.println("count = "+ results[1]);
        System.out.println("Seconds = "+ results[3].replace("(", ""));
        System.out.println("seconds = "+ results[3].substring(1));

    }
}
