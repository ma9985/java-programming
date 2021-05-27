package day10_shorthand_operators;

public class IncrementDecrementOperators {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("i = " + i);
        i++;
        System.out.println("i = "+ i);
        i++;
        i++;
        ++i;
        ++i;
        System.out.println("i = "+ i);

        int linesOfCode = 15;
        System.out.println("linesOFCode = "+ linesOfCode);
        // increase linesofcode by 1 , 3 different ways that we learn today
        linesOfCode += 1;
        ++linesOfCode;
        ++linesOfCode;
        linesOfCode+= 1;
        linesOfCode++;
        System.out.println("LinesOfCode = "+ linesOfCode);

        //below are differ ways of decreasing by 1;
        linesOfCode--;
        linesOfCode = linesOfCode - 1; //traditional way
        --linesOfCode;
        linesOfCode-=1;
        System.out.println("linesOfCode = "+ linesOfCode);

        char letter = 'a';
        System.out.println("letter = " + letter);
        letter++;  //change to next character
        System.out.println("letter = " + letter);
        letter++;
        --letter;
        System.out.println("letter = " + letter);
        letter--;
        System.out.println("letter = " + letter);



    }
}
