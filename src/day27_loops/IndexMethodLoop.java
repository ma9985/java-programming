package day27_loops;
/*
using for loop:
    if charAt(i) matches letter
        store the i value into index

"i is found at index 1"
 */
public class IndexMethodLoop {
    public static void main(String[] args) {
        String word = "github";
        char letter = 'g';
        int index = -1;

        for (int n = 0; n < word.length(); n++) {
            //System.out.println(n +" - " + word.charAt(n));
            if (word.charAt(n) == letter) {
                index = n;
                System.out.println(letter + " is found at index " + index);
                break;  //exit the loop
            }
        }
        // how to know if not found
        if(index == -1) {
            System.out.println(letter + " is not present");
        } else{
            System.out.println(letter + " is found at index " + index);
        }
    }
}
