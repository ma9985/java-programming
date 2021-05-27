package day18_conditions_practice_strings_intro;
/* he will show else if, and nest if with this equation

Make => Mercedes
    Model =>  E
        leasePrice = 500
    Model => A
        leasePrice = 400

Make => Audi
    Model =>  SQ5
        leasePrice = 552
    Model => A3
        leasePrice = 412
print summary
 */
public class CarLeasingTest {
    public static void main(String[] args) {
        String model = "A";
        String make = "Mercedes";
        double leasePrice = 0.0;

        //       if(make.equals("mercedes") && model.equals("E")) {
        //         leasePrice = 500.0;
        //       } else if (make.equals("mercedes") && model.equals("A")) {
        //        leasePrice = 400.0;if(make.equals("mercedes") && model.equals("E")) {
        //           leasePrice = 500.0;
        //       } else if (make.equals("mercedes") && model.equals("A")) {
        //   }

        // ** how to check separate one (nested If statement)
        if (make.equals("mercedes")) {
            if (model.equals("E")) {
                leasePrice = 500.0;
            } else if (model.equals("A")) {
                leasePrice = 400.0;
            } else {
                System.out.println("invalid model");
            }
            System.out.println("make = " + make);
            System.out.println("model = " + model);
            System.out.println("lease price = " + leasePrice);
        }
    }
}

