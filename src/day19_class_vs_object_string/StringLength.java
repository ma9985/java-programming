package day19_class_vs_object_string;

public class StringLength {
    public static void main(String[] args) {
        String word = "Deez nuts";
        System.out.println(word);
        System.out.println("the word of the day is: " + word.length());
        String firstName = "Mohammad Abdelqader";
        System.out.println("My name is this long = " + firstName + " and its " + firstName.length());
        System.out.println(firstName.length());

        int count = firstName.length();
        System.out.println("count = " + count);

        String password = "abc123";
        /**  IF STATEMENT :
         * When password is at least 6 characters:
         * print: valid amazon password
         * else
         * print: password too short
         */
        if (password.length() >= 6) {
            System.out.println("valid amazon password");
        } else {
            System.out.println("password must be at least 6 characters");
        }
    }
}
