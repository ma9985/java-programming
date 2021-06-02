package day49_static;
/*
static balance = 500
String user;
----
spend(double amount) ==> balance-=amount
----
showBalance() //prints current balance
=====================================
 */
public class BankAccount {
      double balance = 500;
      String user;

    public void spend(double amount) {
        System.out.println(user + " is spending $ " + amount);
        balance-=amount;
    }
    public void showBalance() {
        System.out.println("Current balance = " + balance);
    }

}
