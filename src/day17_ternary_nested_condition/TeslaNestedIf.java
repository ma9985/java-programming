package day17_ternary_nested_condition;
/*
char model = 'S';
trim -> "Long range"

when model 'S'
    if trim is "long range":

        "range: 412"
        "top speed: 155 mph"
        "0-60- 3.1sec"
    if trim is "Plaid":

        "range: 412"
        "top speed: 155 mph"
        "0-60- 3.1sec"
    if trim is "Plaid+":

        "range: 412"
        "top speed: 155 mph"
        "0-60- 3.1sec"
when model is '3'
 */
public class TeslaNestedIf {
    public static void main(String[] args) {
        char model = 'S';
        String trim = "Long range";

        if(model == 'S') {
            System.out.println("Model S is selected");
        } if(trim.equals("Long Range")) {
            System.out.println("Long range");
            System.out.println("range: 412");
            System.out.println("top speed: 155 mph");
            System.out.println( "0-60- 3.1sec");
        } if(trim.equals("Plaid")) {
            System.out.println("Long range");
            System.out.println("range: 412");
            System.out.println("top speed: 155 mph");
            System.out.println( "0-60- 3.1sec");
        } if(trim.equals("Plaid++")) {
            System.out.println("Long range");
            System.out.println("range: 412");
            System.out.println("top speed: 155 mph");
            System.out.println("0-60- 3.1sec");
        }
    }
}
