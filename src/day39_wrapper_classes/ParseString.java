package day39_wrapper_classes;

public class ParseString {
    public static void main(String[] args) {
        String total = "345";
        int count = Integer.parseInt(total);
        System.out.println("count = " + count);

        String strPrice = "123.5";
        double price = Double.parseDouble(strPrice);
        if(price > 100){
            System.out.println("expensive");

        }             //   0  1     2    3   4   5
        String sentence = "I wrote 100 lines of code";
        // spit by space, parse index 2 to int
        String[] words = sentence.split(" ");
        int linesOfCode = Integer.parseInt(words[2]);
        System.out.println("linesOfCode = " + linesOfCode);
        
    }
}
