package day32_arrays_split;
import java.util.*;
public class MaxMiniPrice {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "ipad", "iphone 12 Case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 123450};
        double maxPrices= prices[0];
        double minPrice = prices[0];
        int indexOfMaxPrice = 0;
        int indexOfMinPrice = 0;
        for (int i = 0; i<prices.length; i++){
            if (maxPrices < prices[i]){
                 maxPrices = prices[i];
                 indexOfMaxPrice = i;

            }
        }
        for (int i = 0; i<prices.length; i++){
            if (prices[i]< minPrice){
                minPrice = prices[i];
                indexOfMinPrice = i;
            }
        }
        System.out.println(items[indexOfMaxPrice] + " $"+maxPrices+" -"+itemIDs[indexOfMaxPrice]);
        System.out.println(items[indexOfMinPrice] + " $"+minPrice+" -"+itemIDs[indexOfMinPrice]);
    }
}
