package day32_arrays_split;

public class MallShopping {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "ipad", "iphone 12 Case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 123450};
        System.out.println("----Find The Index Of 'Gloves' in items arrays----");
        for (int i = 0; i<items.length; i++){
            if (items[i].equals("Gloves")){
                System.out.println(i + " - "+ items[i]);
                break;
            }
        }
        System.out.println("--Set Boolean to true if first 'ipad' is found");
        boolean ipadExistts = false;
        //for (String item : items)
        for (int i = 0; i<items.length; i++){
            if(items[i].equals("ipad")){
                ipadExistts=true;
                break;
            }
        }
        System.out.println(ipadExistts );
        System.out.println("--Print a report of each shopping item--");
        for (int i=0; i < items.length; i++) {
                System.out.println(items[i] + "\t- $" + prices[i] + "\t- " +itemIDs[i]);
        }
        System.out.println("--Look for 'Jacket' in items and print all details ");
        for (int i=0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("Jacket")) {
                System.out.println(items[i] + "\t- $" + prices[i] + "\t- " + itemIDs[i]);
                break;
            }
        }
    }
}
