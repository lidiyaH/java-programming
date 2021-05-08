package day41_arraylist;

import java.util.ArrayList;

public class CitiesList {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        //Add cities to arrayList -> add methods
        cities.add("Washington DC");
        cities.add("New York");
        cities.add("Adana");
        cities.add("LA");
        //add Ashgabat to index 0 index
        cities.add(0, "Ashgabat");
        System.out.println(cities);
        // print first and last city
        System.out.println("first city = " + cities.get(0));
        System.out.println("last city = " + cities.get(4));
        //find the last city using size()-1
        System.out.println("last city = " + cities.get(cities.size()-1));
        System.out.println("count of items= " + cities.size());
        int size = cities.size();
        System.out.println("There are "+ size + " cities in the list");
         // for loop and print all values in same line
        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i)+ " ");
        }
        for (String city : cities) {
            System.out.println(city + " ");
        }
        // Remove using index. delete value at index 3
        cities.remove(3);
        //remove using object/value
        cities.remove("LA");
        System.out.println("after remove " + cities);
        //delete/remove all value from list
        cities.clear();
        System.out.println(cities);
    }

}
