package day20_string_manipulationIntro;

public class StringIsEmpty {
    public static void main(String[] args) {
        String jobTitle = "";
        System.out.println(jobTitle.length());
        System.out.println(jobTitle.isEmpty());
        System.out.println(jobTitle.equals(""));

        if (jobTitle.isEmpty()) {
            System.out.println("job title is missing, please resend");
        } else {
            System.out.println(" job title looks good");
        }
        if (jobTitle.length() == 0) {
            System.out.println("job title is empty");
        } else {
            System.out.println(" job title isn't empty");
        }
        System.out.println(jobTitle.equals(" "));
        if ("".equals(jobTitle)) {
            System.out.println("job title is empty");
        }
        System.out.println("job title is not empty");

        String word = " ";
        System.out.println(word.isEmpty()); //false
        System.out.println(word.length()); // 1.blank space is empty.

        String veggie = "carrots";
        System.out.println(veggie.isEmpty()); // false

        if(!veggie.isEmpty()) {
            System.out.println("we have " + veggie);
        }
        String word2;
       //  System.out.println(word2.isEmpty());   ** this means error. cant do this way
     }


}
