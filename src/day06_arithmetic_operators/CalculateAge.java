package day06_arithmetic_operators;

public class CalculateAge {
    public static void main(String[] args){
        int yearsOfBirth = 1987;
        int currentYear = 2021;
        int age = currentYear - yearsOfBirth;
        System.out.println("You are " + age + " years old");
    }
}
