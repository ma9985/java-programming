package OffDayCoding;
import java.util.Scanner;
/*
    [Season & Day length]
    The seasons will determine how long each day and night are.
    The season will be determined by a number:
    > 1 - Spring
    day: 14
    night: 10
    > 2 - Summer
    day: 16
    night: 8
    > 3 - Fall
    day: 14
    night: 10
    > 4 - Winter
    day: 12
    night: 12
*/
public class ScannerPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The Seasons details");
        int season = input.nextInt();
        int day = 0;
        int night = 0;
        String seasonName = "";

        if(season == 1) {
            day = 14;
            night = 10;
            seasonName = "Spring";
        }
        if (season == 2) {
            day =16;
            night = 9;
            seasonName = "Summer";
        }
        if (season == 3) {
            day = 14;
            night = 10;
            seasonName = "Fall";
        }
           if (season == 4) {
               day = 12;
               night = 12;
               seasonName = "Winder";
           }
        System.out.println("In " + seasonName + " it is " + day + " hours per daytime " + " and at night its " + night +" hours.");
    }

}
