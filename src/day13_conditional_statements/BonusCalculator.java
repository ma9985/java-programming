package day13_conditional_statements;
// bonus = 0
//salesAmount = 2000

// salesAmount <-- 1000
//"Good job, you qualified for bonus!"
// ->assign  50 to bonus
//  else

// "Great job, you qualified for full bonus!"
// ->assign 100 to bonus
// your bonus for salesAmount is $100
public class BonusCalculator {
    public static void main(String[] args) {
        double bonus = 0.0;
        double salesAmount = 5000.00;

        if (salesAmount <= 2000) {
            System.out.println("Good job, you qualified for bonus!");
            bonus = 50.00;
        } else {
            System.out.println("Great job, you qualified for full bonus");
            bonus = 100.00;
        }
        System.out.println("Your total bonus : $" + bonus);


    }
}
