package day31_arrays;

public class CharArrays {
    public static void main(String[] args) {
        char[] letters = {'j','a','v','a',' ', 'i', 's',' ', 'f','u','n'};
        //print each letters using a loop
        for(char each : letters){
            System.out.print(each + " ");
            // when we have char array, we can create a string out of it.
            // It will automatically join each letter into single string
            //string senetence = new String(letters);
            // Convert Char array into string-create a new string with char array
            //convert string to char array
        }
        String sentence = new String(letters);
        System.out.println("\n senetence= "+ sentence);
        String item = "wooden spoon";
        char[] itemArray = item.toCharArray();
        System.out.println("itemArray.length = "+ itemArray.length);
        System.out.println("itemArray.length = " + item.length());
        String[] fruits = {"bananas" , "apples", "kiwi", "mango", "papaya", "strawberry"};
        String fruitstr = "";
        for (String each : fruits){
            System.out.print(each + " -");
            fruitstr += each + "-";
        }
        System.out.println("\nfruitstr = "+ fruitstr);
        String[] languages = {"java","pyhon","c++","sql","ruby","javascript"};
        System.out.println(String.join("|",languages));
        System.out.println(String.join("##",languages));
        String joinedlanguagrs = String.join("<>",languages);
        System.out.println("joinedlanguagrs = " + joinedlanguagrs);
        //string str = "git"; (convert str to char)
        // char[] letters = str.toCharArray();
        // letters ===> 'g','i','t'
    }
}
