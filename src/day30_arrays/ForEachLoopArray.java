package day30_arrays;

public class ForEachLoopArray {
    public static void main(String[] args) {
        //             0   1   2    3 ....
        int[] data = {32, 532, 1, 5454, 22, 123, 543, 999, 321, 3};

        for (int eachNum : data) {
            System.out.print(eachNum+" ");
        }
        for (int n : data) {
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println("-----------for loop---------");
        //repeat above with regular for loop
        for ( int i = 0; i < data.length; i++){
            System.out.println(data[i]);
        }

        //print last value in array using length -1
            //                                         "10 words"   ... will get 3
        System.out.println("last value: " + data[data.length - 1]);

        //print all number backwards in same line
        for(int idx = data.length -1; idx >= 0; idx--){
            System.out.println(data[idx] + " ");

        }
    }
}