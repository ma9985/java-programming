package day46_encapsulation;

public class CapitalOne { 
    public static void main(String[] args) {
        CheckingAccount acc = new CheckingAccount();
        acc.setAccountNumber(1823798079);
        acc.setAccountHolder("Mike Smith");
        acc.setAccountType("360 Checking");
        acc.setBalance(250.50);
        System.out.println("acc = " + acc);
    }


}
