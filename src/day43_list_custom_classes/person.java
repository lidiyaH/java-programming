package day43_list_custom_classes;

public class person {
    String firstName;
    int age;
}
class people {
    public static void main(String[] args) {
        //create object of person - Instantiate person class
        person person1 = new person();
        person1.firstName = "lidiya";
        person1.age = 25;

        System.out.println(person1.firstName);
        System.out.println(person1.age);
    }
}