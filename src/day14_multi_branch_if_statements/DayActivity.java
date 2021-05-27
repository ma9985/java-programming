package day14_multi_branch_if_statements;
/*
weather ->  "sunny", "rainy", "snowy", "windy" ...

when "sunny" :
    -> "Go to park, hiking, and code java"

when "rainy" :
    -> "stay home, drink tea, and code java"

when "snowy" :
    -> "clean the car then build snowman, drink hot chocolate, and code java"

when "windy" :
    -> "Get ready for power loss, fly a kite, and code java"

anything else:
    -> "just keep coding java"
 */
public class DayActivity {
    public static void main(String[] args) {
        System.out.println(""); // this adds space on top
        String weather = "raining";

        if (weather.equals("sunny")) {
            System.out.println(weather+" - Go to park, hiking, and code java");
        } else if (weather.equals("raining")) {
            System.out.println(weather + " - stay home, drink tea, and code java");
        } else if (weather.equals("snowy")) {
            System.out.println(weather + " - clean the car then build snowman, drink hot chocolate, and code java");
        } else if (weather.equals("windy")) {
            System.out.println(weather + " - Get ready for power loss, fly a kite, and code java");
        } else {
            System.out.println("just keep coding java");
        }
    }
}
