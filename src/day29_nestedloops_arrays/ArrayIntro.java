package day29_nestedloops_arrays;

public class ArrayIntro {
    public static void main(String[] args) {
        int num = 10; //single variable
        int[] nums = new int[3]; // array variable
        //[3] above means, this array can hold 3 int values.
        //once we use []. java knows it is array automatically
        nums[0] = 5;
        nums[1] = 10;            // the array is [5, 7, 10]
        nums[2] = 7;
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);


        int i = 0;
        System.out.println(nums[i]); //5
        i++;
        System.out.println(nums[i]); //10

        // how to find out the size of the array
        System.out.println("numbers of elements = " + nums.length);
        //store length of array into length variable
        int lengths = nums.length;
        System.out.println("lengths = " + lengths);

        //change values in the array
        nums[0] = 100;
        nums[1] = 300;
        // read the value of index 1 and assign same to index 2
        nums[2] = nums[1];

        System.out.println("nums[0] = " + nums[0]);
        System.out.println("nums[1] = " + nums[1]);
        System.out.println("nums[2] = " + nums[2]);

        /*
        1) declare and specify the size, then assign values.
        This way is good to use when we know the count of items we need, but do not know the values yet.

int[] nums = new int[3];
nums[0] = 123;
nums[1] = 343;
nums[2] = 1254563;

Above, size is 3, but largest index is 2.

2) Declare and assign value in same statement.
This way is good to use when we already have data to assign to our array.
         */
        int [] nums1 = {234, 12, 343, 545, 234, 222, 99};
        //In above example, we declare array with size 7 and assigned values in same statement.
        //System.out.println(nums.length); ==> 7
        //System.out.println(nums[0]); 234-
    }
}
