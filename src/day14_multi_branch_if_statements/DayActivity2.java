package day14_multi_branch_if_statements;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.crypto.spec.PSource;

/* else if practice
weather ->  "sunny", "rainy", "snowy", "windy" ...

when "sunny" :
    -> "Go to park, hiking, and code java"

when "rainy" :
    -> "stay home, drink tea, and code java"

when "snowy" :
    -> "clean the car then build snowman, drink hot chocolate, and code java"

when "windy" :
    -> "clean the car then build snowman, drink hot chocolate, and code java"

anything else:
    -> "just keep coding java"
 */
public class DayActivity2 {
    public static void main(String[] args) {
        System.out.println(" ");
        String weather = "raining";

        if (weather.equals("sunny")) {
            System.out.println("Go to park, hiking, and code java");
        } else if (weather.equals("raining")) {
            System.out.println("stay home, drink tea, and code java");
        } else if (weather.equals("snowy")) {
            System.out.println("clean the car then build snowman, drink hot chocolate, and code java");
        } else if (weather.equals("windy")) {
            System.out.println("clean the car then build snowman, drink hot chocolate, and code java");
        } else {
            System.out.println("Keep coding java");
        }
    }
}
