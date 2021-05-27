package OfficeHours.OfficeHours_05_12_2021;

public class pracitine {
    public static void main(String[] args) {
        String str = "";
        String[] arr = str.split("");

        String unique1 = "";

        for (int j = 0; j < arr.length; j++) {

            int num = 0;

            for (int i = 0; i < arr.length; i++) {

                if (arr[i].equals(arr[j]))

                    num++;

            }

            if (num == 1)

                unique1 += arr[j];
            System.out.println(arr[j]);
        }
    }
}