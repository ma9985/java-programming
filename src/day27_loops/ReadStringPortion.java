package day27_loops;

public class ReadStringPortion {
    public static void main(String[] args) {
        //             01234
        String list = "cat,car,cat,red_car,java,selenium";
//        int i =0;
//        // using substring print first 3 letters
//        System.out.println(list.substring(0, 3));
//        System.out.println(list.substring(1, 4));
//        System.out.println(list.substring(2, 5));
//        System.out.println(list.substring(3, 6));
//        System.out.println(list.substring(i, i+3));
        // to use three characters use -2.  must put also -2 to not get error. means will stop early
        for(int i = 0; i < list.length()-2; i++) {
            System.out.println(list.substring(i, i+3));


           String part = list.substring(i, i+3); //we added this so we can shrink the code a little.
            //if statement for above using cat or car and print 'cat or car found'
            if(part.equals("cat") || part.equals("car")) {
                System.out.println("Cat or car found");
            }
        }
    }
}
