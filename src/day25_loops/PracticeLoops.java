package day25_loops;

public class PracticeLoops {
    public static void main(String[] args) {
        // While loop
        int num = 1;
        while (num <= 10) {
            System.out.print(num + " ");
            num++;
        }
        System.out.println();
        System.out.println("------------------------------------------------------");

        // do while loop
        int sum1 = 11;
        do {
            System.out.print(sum1 + " ");
            sum1++;
        } while (sum1 <= 20);
        System.out.println();
        System.out.println("------------------------------------------------------");

        // For Loop

        for (int floop = 21; floop <= 30; floop++) {
            System.out.print(floop + " ");
        }
    }
}
