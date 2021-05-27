package OffDayCoding;
import java.util.Scanner;

public class MiddleNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        String initials = word.substring(0,1).toLowerCase();
        String initialsTwo = word.substring(word.length()-1);
        System.out.println(initials+initialsTwo);
            }
        }

