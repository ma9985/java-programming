package day37_methods_overloading;

import javax.imageio.stream.ImageInputStream;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(10,5);
        addNumbers(100, 200, 300);
        addNumbers(23,25,26,30,45,15,66,87,69,89,77,78);
    }

                                   //varargs
    public static void addNumbers(int... nums) {

        //inside the method, it is used as regular array
        int sum = 0;
        for(int n : nums) {
            sum += n;
        }
        System.out.println("sum = " + sum);
    }


}
