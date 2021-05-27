package day36_methods_with_return;

import java.util.Random;

/*
Method name: fullName
No params
returns "Mike Smith"

Method name: isMarried
return false

method name: getAge
returns 35
 */
public class Info {
    public static void main(String[] args) {
        fullName();
        System.out.println("fullName = " + fullName());
        System.out.println("isMarried = " + isMarried());
        System.out.println("getAge = " + getAge());
        System.out.println("Birth Year = " + getRandomYear());  //dynamic. diff each year

        String name = fullName();
        boolean status = isMarried();
        int age = getAge();
        int year = getRandomYear();

        System.out.println("name = " + name);
        System.out.println("married = " + isMarried());
        System.out.println("year = " + year);
        System.out.println("age = " + age);
    }

    public static String fullName() {
       // System.out.println("inside fullName method");
            return "Mike Smith";
    }
    public static boolean isMarried() {
        return true;
        }
        public static int getAge() {
        return 35;

    }
    public static int getRandomYear() {
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;
    }
}
