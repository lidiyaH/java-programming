package day30_arrays;

public class ArrayLoopWithConditions {
    public static void main(String[] args) {
        double[] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};

        String[] countries = {"Brazil",
                "China",
                "Cuba",
                "Sweden",
                "France",
                "Vietnam",
                "Albania",
                "Brazil",
                "Portugal",
                "China",
                "Philippines",
                "Philippines",
                "China",
                "Philippines",
                "China",
                "Armenia",
                "Philippines",
                "China",
                "Colombia",
                "Philippines",
                "Honduras",
                "Indonesia",
                "Brazil",
                "China",
                "United States",
                "Russia"};
        //Print all numbers from prices array that are more than 100
        System.out.println("-----Prices More than 100");
        for (double eachprice : prices) {
            if (eachprice > 100) {
                System.out.print(eachprice + " ");
            }

        }
        System.out.println("\n------Prices between 10 and 70");
        for (double price : prices) {
            if (price >= 10 && price <= 70) {
                System.out.println(price + " ");
            }
        }
        System.out.println("\n ---- Count of tyhe prices that are more than 50-----");
        int count = 0;
        for (double each : prices) {
            if (each >= 50) {
                count++;
            }
        }
        System.out.print(count);
        System.out.println("\n---countries with name length more than 7-inclusive---");
        for (String country : countries) {
            if (country.length() >= 7) {
                System.out.print(country + "-" + country.length()+" ");
            }

        }
    }
}

