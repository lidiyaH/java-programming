package day10_shorthand_operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        int cars = 10;
        System.out.println("cars in the parking lot = " + cars);
        cars = cars + 2;
        System.out.println("cars = " + cars);
        cars += 5;
        System.out.println("cars = " + cars);
        cars -= 5;
        System.out.println("cars = " + cars);
        int electricCars= 13;
        System.out.println("Electric cars = "+ electricCars);
       cars = cars + electricCars;
        System.out.println("cars = " + cars);

        String word = "java";
        System.out.println("word = " + word);
        word += "fun";
        System.out.println("word = " + word);

        String selenium = "but \"selenium\" is more fun. ";
        word += selenium;
        System.out.println("word = " + word);
        word += 12345;
        System.out.println("word = " + word);
        char letter = 'A';
        System.out.println("letter = " + letter);
        letter += 3;
        System.out.println("letter = " + letter);
        letter += 'j';
        System.out.println("letter = " + letter);
        double parkingFee = 7.50;
        System.out.println("parkingFee = " + parkingFee);
        parkingFee /= 2;
        System.out.println("parkingFee = " + parkingFee);







    }
}
