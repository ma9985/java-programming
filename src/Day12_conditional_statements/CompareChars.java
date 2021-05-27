package Day12_conditional_statements;

public class CompareChars {
    public static void main(String[] args) {
        char letter1 = 'A';
        char letter2 = 'J';
        System.out.println(letter1 > letter2);
        System.out.println(letter1 < letter2);
        System.out.println(letter1 == letter2);

        char grade = 'E';
        boolean pass = grade <= 'D';
        System.out.println("Did you pass the exam? " + pass);
// make sure asci table is on hand to base this off numbers when seeing which is big
    }
}
