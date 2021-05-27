package day43_list_custom_classes;

public class Person {
    //Data -> variables
    String firstname;
    int age;
    char gender;
    // behavior
    public void speak() {
        System.out.println("person is speaking");
    }
}
class People {
    public static void main(String[] args) {
        //we created object of Person class - Instantiation
        Person person1 = new Person();
        person1.firstname = "Bob";
        person1.age = 33;
        person1.gender= 'M';
        person1.speak();

        System.out.println(person1.firstname);
        System.out.println(person1.age);
        System.out.println(person1.gender);

        Person person2 = new Person();
        person2.firstname = "Mohammad";
        person2.age = 2;
        person2.gender = 'M';
        person2.speak();

        System.out.println(person2.firstname);
        System.out.println(person2.age);


    }
}