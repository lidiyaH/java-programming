package day33_arrays;

import java.util.Arrays;

public class MultiDArrayEample {
    public static void main(String[] args) {
        String[][] users = new String[3][2];
        users[0][0]= "lidiya habib";
        users[0][1] = "lid2345";
        users[1][0]= "Misganaye habib";
        users[1][1]= "Mis45678";
        users[2][0] = "Fruit Habib";
        String[][] userData ={{"lidiya habib" ,"lid2345" } ,
                        {"Misganaye habib" ,"Mis45678" } ,
                         {"Fruit Habib" ,"Fruit356" }};
        System.out.println(userData[0][0]);
        System.out.println(userData[0][1]);
        System.out.println(userData[1][0]);
        System.out.println(userData[1][1]);
        System.out.println(userData[2][0]);
        System.out.println(userData[2][1]);
        System.out.println(Arrays.deepToString(userData));
        }
}
