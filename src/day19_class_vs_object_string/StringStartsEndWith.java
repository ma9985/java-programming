package day19_class_vs_object_string;

public class StringStartsEndWith {
    public static void main(String[] args) {
        String word = "Area code";
        {
            System.out.println(word.endsWith("ode"));
            System.out.println(word.endsWith("Area code"));
            System.out.println(word.endsWith("code"));
            System.out.println("java".startsWith("j"));

            System.out.println(word.startsWith("int")); // false, case sensitive
        }

    String name = "Irina";
        if(name.endsWith("n")) {
            System.out.println("Maybe, it is a female name");

            String firstName = "Dr. Nadir";
            if(firstName.startsWith("Mr.")) {
                System.out.println("he is married");
            } else if (firstName.startsWith("Dr.")) {
                System.out.println("he is a doctor");
            } else if(firstName.startsWith("Mrs.")) {
                        System.out.println("She is married");
            } else if (firstName.startsWith("Ms.")){
                System.out.println("She is single");
            } else if (firstName.startsWith("Sr.")) {
                System.out.println("Is a senior");

            }

        }


    }
}
