package day29_nestedloops_arrays;
/*
minute and second loops:

minute 1
    second 1,2,3,4,5,6,7,8,9,10....60

minute 2
    second 1,2,3,4,5,6,7,8,9,10....60

minute 3
    second 1,2,3,4,5,6,7,8,9,10....60
 */
public class NestedForLoops {
    public static void main(String[] args) {
        for(int minutes = 1; minutes <= 5; minutes++){
            System.out.println("\nminutes = " + minutes);
            for(int seconds = 1; seconds <= 60; seconds++ ){
                System.out.print(seconds+" ");
            }
        }

        /*
        /**
         * 0:1
         * 0:2
         * 0:59
         * 1:0
         * 1:1
         * 1:2
         * ..
         */

        System.out.println();
        for(int minutes = 0; minutes <= 4; minutes++) {
            for(int seconds = 0; seconds <=59; seconds++){
                System.out.println(minutes + ":" + seconds);
            }
        }
    }
}
