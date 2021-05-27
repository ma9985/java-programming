package day38_methods;
import com.sun.jmx.snmp.SnmpUnknownMsgProcModelException;

import java.util.Arrays;

public class ArraysUtils {
    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    } //learning how to write custom methods

    public static int sum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }


    /*
       method name:
   contains
       params:
           int[] nums, int num

   return: boolean
   if num is among nums, return true , otherwise false
        */

    public static boolean contains(int[] nums, int num) {
        boolean found = false;
        for(int each : nums) {
            if(each == num) {
                found = true;
                break;
            }
        }
        return found;
    }
}
