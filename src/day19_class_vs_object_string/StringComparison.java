package day19_class_vs_object_string;
/*
String variable city and assign value

equals()
equalsIgnoreCase()
 */
public class StringComparison {
    public static void main(String[] args) {
        String city = "Chicago";
        System.out.println(city.equals("Chicago")); // TRUE
        System.out.println(city.equals("chicago")); // false
        System.out.println(city.equals("Chicago ")); // false


        //EQUALSignoreCAse() method = case sensitive comparison
        System.out.println(city.equalsIgnoreCase("Chicago")); // TRUE
        System.out.println(city.equalsIgnoreCase("CHICAGO")); // true
        System.out.println(city.equalsIgnoreCase("CHiCagO")); //true
        System.out.println(city.equalsIgnoreCase("Chiicago")); //false
        System.out.println(city.equalsIgnoreCase("Chi cago")); //false

        if(city.equals("Chicago")) {
            System.out.println("equals() true");
        } else {
            System.out.println("equals() false");
        }
        if (city.equalsIgnoreCase("Chicago")) {
            System.out.println("equalsIgnoreCase() true");
        } else {
            System.out.println("equalsIgnoreCase() false");
        }


    }
}
