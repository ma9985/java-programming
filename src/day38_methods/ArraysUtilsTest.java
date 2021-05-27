package day38_methods;

public class ArraysUtilsTest {
    public static void main(String[] args) {
        int[] nums = {5,23,1,543,90};
        ArraysUtils.printArray(nums);
        ArraysUtils.printArray(new int[]{23,64,58,56,96,74,25,85,98});
            //this one above is a short cut
        System.out.println("sum = " + ArraysUtils.sum(nums));
        System.out.println("sum = " + ArraysUtils.sum((new int[]{23,64,58,56,96,74,25,85,98})));


        int[] nums2 = {4, 1, 5, 8};

      //  System.out.println("5 - found = " + ArrayUtils.contains(nums2, 5));
        //System.out.println("10 - found = " + ArrayUtils.contains(nums2, 10));
    }
}
