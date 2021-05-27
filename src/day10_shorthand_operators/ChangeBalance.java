package day10_shorthand_operators;

public class ChangeBalance {
    public static void main(String[] args) {
        double balance = 1230.55;
        System.out.println("Balance = " + balance);

        double baklawa = 22.50;
        System.out.println("Baklawa = " + baklawa);
        balance = balance - baklawa;
        System.out.println("balance after Baklawa = " + baklawa);

        double knafa = 44.5;
        System.out.println("knafa = " + knafa);
        balance = balance - knafa;
        System.out.println(" balance after knafa = " + knafa);

        knafa = knafa / 2;
        System.out.println("knafa = " + balance);

        balance = balance - knafa;
        System.out.println(" balance after knafa = " + balance);

        double plov = 7.99;
        System.out.println( plov = + plov);
        balance = balance - plov;
        System.out.println("balance after plov = " + balance);

        double iceTea = 3.00;
        System.out.println("iceTea = " + iceTea);
        // buy 4 iced teas and decrease balance
        balance = balance - iceTea * 4;
        System.out.println("balance after ice tea = " + balance);

        System.out.println("returning baklawa = " + balance);
        balance = balance + baklawa;
        System.out.println("balance after returning baklawa = $" + balance);

    }
}
