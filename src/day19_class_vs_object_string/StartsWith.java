package day19_class_vs_object_string;

public class StartsWith {
    public static void main(String[] args) {
        String name = "Irina";
        if(name.endsWith("n")) {
            System.out.println("Maybe, it is a female name");

            String firstName = "Dr. Nadir";
            if (firstName.startsWith("Mr.")) {
                System.out.println("he is married");
            } else if (firstName.startsWith("Dr.")) {
                System.out.println("he is a doctor");
            } else if (firstName.startsWith("Mrs.")) {
                System.out.println("She is married");
            } else if (firstName.startsWith("Ms.")) {
                System.out.println("She is single");
            } else if (firstName.startsWith("Sr.")) {
                System.out.println("Is a senior");

            }
        }
    }
    }

