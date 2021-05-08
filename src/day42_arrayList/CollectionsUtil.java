package day42_arrayList;
import java.util.*;
public class CollectionsUtil {
    public static void main(String[] args) {
        List<Character> letters = new ArrayList<>();
        letters.addAll(Arrays.asList('j', 'a','v','a', 'i',
                's', 'f', 'u', 'n'));
        System.out.println("Size= "+ letters.size());
        System.out.println(letters);
        Collections.reverse(letters);
        System.out.println("reversed ="+ letters);
        System.out.println(Collections.frequency(letters, 'a'));
        int vcount = Collections.frequency(letters,'v');
        System.out.println("vcount = " + vcount);
        System.out.println("Max char= " + Collections.max(letters));
        System.out.println("Min char= " + Collections.min(letters));
        Collections.reverse(letters);
        Collections.replaceAll(letters,'a','u');
        Collections.replaceAll(letters,'i','j');
        System.out.println("after replace" + letters);
        Collections.sort(letters);
        System.out.println(letters);

    }
}
