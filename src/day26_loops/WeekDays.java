package day26_loops;
/*
loop n =  1 - 10

inside loop: using switch statement
    n -> 1 ->
        "1 - Monday"
    n -> 2 ->
        "2 - Tuesday"
    n -> 3 ->
        "3 - Wednesday"
    n -> 4 ->
        "4 - Thursday"
    n -> 5 ->
        "5 - Friday"
    n -> 6 ->
        "6 - Saturday"
    n -> 7 ->
        "7 - Sunday"
    n -> "8 - no such day, it is java day"
 */
public class WeekDays {
    public static void main(String[] args) {


        for(int days = 1; days <= 10; days++){
            switch(days) {
                case 1:
                    System.out.println(days +" - Mondays");
                    break;
                case 2:
                    System.out.println(days +" - tuesday");
                    break;
                case 3:
                    System.out.println(days +" - Wednesday");
                    break;
                case 4:
                    System.out.println(days +" - Thursday");
                    break;
                case 5:
                    System.out.println(days +" - Friday");
                    break;
                case 6:
                    System.out.println(days +" - Saturday");
                    break;
                case 7:
                    System.out.println(days +" - Sunday");
                    break;
                default:
                    System.out.println(days +"- no such day, it is java day");
            }

        }

    }

}
