package day25_loops;
import java.util.*;
/*
    Enter start and end
int start
int end

print all numbers from start till end separated by space

start = 3
end = 6

3 4 5 6

start = 30
end = 6
when start is more than end,
    "reverse numbering is not supported"
 */
public class StartEnd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter start and end");
        int end = scan.nextInt();
        int start = scan.nextInt();

            if (start > end) {
                System.out.println("reverse numbering is not supported");
            }

        for (int i = start ; i <= end ; i++) {
            System.out.println(i+" ");
        }
    }
}
