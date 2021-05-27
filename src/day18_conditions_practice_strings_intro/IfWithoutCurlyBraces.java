package day18_conditions_practice_strings_intro;

public class IfWithoutCurlyBraces {
    public static void main(String[] args) {
        String TodayClass = "python";

        if (TodayClass.equals("Java"))
            System.out.println("Java is fun");
            // System.out.println("java is fun again");

        else
            System.out.println("it is not java. it is " + TodayClass);
        /*
        Sometimes, we can skip using curly {} braces with if conditions.
WHEN:
    when we have ONLY 1 statement in IF block or ELSE block.
    If we have more than 1 statement (;) then we MUST use { } to work.

ADVICE:
    always use curly braces, does not matter 1 or more statements. NO benefit of skipping { }

         */
        int score = 1;

        if (score == 1) {
            System.out.println("Lowest score 1");
        } else if (score == 2) {
        System.out.println("Score is 2");
    } else {
            System.out.println("invalid score");
        }
        /*
        Above example both will work, because we have only 1 statement for each condition.

        for below statement , we cannot use without curly braces:
         */
        int score2 = 1;
        if(score > 0) {
            System.out.println("pass");
            System.out.println("your score is " + score2);
        } else {
            System.out.println("fail");
            System.out.println("your score is " + score2);
        }
        //ERROR BELOW:
        int score3 = 1;
        if(score > 0)
            System.out.println("pass");
        System.out.println("your score is " + score3);
        //else
        System.out.println("fail");
        System.out.println("your score is " + score3);
        /*
        int a = 2;
if(a == 1)
    System.out.println("a is 1");
    System.out.println("1 is a");

OUTPUT:
    1 is a

In above example, only first print statement is related to IF block. second print statement is outside if block and will always run.

RULE:
    Always use curly braces, so you dont go wrong.

=================================

int a = 1;

if(a == 1)
    System.out.println("a is 1");
    System.out.println("1 is a");

OUTPUT:
    a is 1
    1 is a
         */
}
}

