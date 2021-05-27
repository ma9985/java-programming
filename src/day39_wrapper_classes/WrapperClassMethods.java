package day39_wrapper_classes;

public class WrapperClassMethods {

    public static void main(String[] args) {

        System.out.println(Integer.max(10, 5));
        System.out.println(Integer.sum(50, 35));
        System.out.println(Integer.min(5, 2));
        System.out.println(Double.max(234.4, 23.9));
        System.out.println("MIN MIN : " + Integer.MAX_VALUE);
        System.out.println("MIN INT: " + Integer.MIN_VALUE);

        System.out.println(Double.compare(5, 1)); //1
        System.out.println(Double.compare(5, 5)); // will be zero
        System.out.println(Double.compare(5, 45)); // its -1 first is smaller than second

        System.out.println(Character.isDigit('8')); //true
        System.out.println(Character.isDigit('v')); // false
        System.out.println(Character.isAlphabetic('Q')); // true
        System.out.println(Character.isLetter('r')); // true
        char letter = 'A';
        if (Character.isUpperCase(letter)) {
            System.out.println("it is upperCase");
        }
        String word = "JaVa Is FuN";
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                System.out.print(word.charAt(i) + " ");


            }
        }
        /**         IQ
         *    How do you convert String into number?
         *
         *    we can use parse or valueOf methods in wrapper classes.
         *    ex.  String >> int
         *
         *    String total = "345";
         *    int count = Integer.parseInt(total);
         *    int num = Integer.parseInt("55");
         *
         *    String strPrice = "123.99"
         *    double price = Double.parseDouble(strPrice);
         */


    }

}
