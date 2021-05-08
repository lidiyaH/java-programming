package day41_arraylist;

import java.util.ArrayList;
import java.util.List;

public class updatingArrayList {
    public static void main(String[] args) {
        //cars list
        List<String> myCars = new ArrayList<>();
        myCars.add("toyota");
        myCars.add("mazda");
        myCars.add("ford");
        myCars.add("tesla");
        myCars.add("lexus");
        myCars.add(0, "jeep");
        myCars.add(1, "lada");
        myCars.add(2, "yugo");
        System.out.println(myCars.toString());//print all cars
        String  allcarsInSt = myCars.toString();//saves all cars in 1 string variable
        System.out.println(allcarsInSt);
        // change index 0 to lamborghini
        myCars.set(0, "Lamborghini");
        System.out.println(myCars);
        myCars.set(4,"honda");
        System.out.println(myCars);
        /**array myCras[4] = "honda";**/
        //we dont have replace in arraylist we can use set
        //find the index number of "ford"
        System.out.println("index of ford ="+ myCars.indexOf("ford"));
        int lexusindex= myCars.indexOf("lexus");
        System.out.println(lexusindex);
        //change lexus to jiguli
        myCars.set(lexusindex, "jiguli");
        System.out.println(myCars);
        myCars.set(myCars.indexOf("ford"),"trabant" );
        System.out.println(myCars);

        //contains
        if (myCars.contains("lada")) {
            myCars.set(myCars.indexOf("lada"), "bugatti");
        }else {
            System.out.println("after set bugatti ="+ myCars.toString());
        }
        System.out.println(myCars);
        for (int i = 0; i<myCars.size(); i++) {
            if (myCars.get(i).equals("Lamborghini")) {
                myCars.set(i, "prius");
            }else if (myCars.get(i).equals("toyota")){
                myCars.set(i, "lexus");
            } else if (myCars.get(i).equals("trabant")) {
                myCars.set(i, "audi");
            }

        }
        System.out.println(myCars);

    }
}
