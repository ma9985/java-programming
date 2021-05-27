package day31_arrays;
/*
char array with following values:
'j', 'a', 'v', 'a', ' ', 'i', 's', 'f', 'u', 'n'
 */
public class CharArray {
    public static void main(String[] args) {
        char[] letters = {'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n'};
        // print each letter using a loop

        for (char letter : letters) {
            System.out.print(letter + " ");
        }
        String sentence = new String(letters);
        System.out.println("\nsentece = " + sentence);

        String item = "wooden spoon";
        char[] itemArray= item.toCharArray();
        System.out.println("itemArray.length = " + itemArray.length);
        System.out.println("item.length() = " + item.length());
        //                      0         1         2       3       4           5
        String[] fruits = {"bananas", "apples", "kiwi", "mango", " papaya", " strawberry"};
        //

        String fruitStr = "";
        for(String each : fruits){
            System.out.print(each + "-");
            fruitStr += each + " ";
        }
        System.out.println("\nFruitStr = " + fruitStr);

        String[] languages = {"java", "python", "c++", "ruby", "javascript", "sql"} ;

        System.out.println(String.join("|", languages));
        System.out.println(String.join("##", languages));

        String joinedLanguages = String.join("  <>", languages);
        System.out.println("languages = " + joinedLanguages);
    }

}
