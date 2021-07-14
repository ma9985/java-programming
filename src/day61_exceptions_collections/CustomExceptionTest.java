package day61_exceptions_collections;

public class CustomExceptionTest {
    public static void main(String[] args) {
        int minutes = 60;
        System.out.println("Class is going on for " + minutes + " minutes");
        if(minutes >50) {
            throw new BreakTimeException("It's break time");
        }
        System.out.println("Let's continue class");

        double balance = 400.00;
        double itemPrice = 500.00;
        System.out.println("I have $" + balance +" and purchasing item for $" + itemPrice);
        if(itemPrice > balance) {
            throw new InsufficientBalanceException("Transaction declined. Not enough funds :(");
        }
        System.out.println("Item successfully purchased");
    }
}
