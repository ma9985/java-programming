package day15_logicallops_switch_ternary;

public class JobOfferSelector {
    public static void main(String[] args) {
        String location = "Chicago";
        double salary = 95000;
        boolean isRemote = true;
        boolean benefits = false;

        if (location.equals("Chicago") && salary >= 95000 && isRemote && benefits) {
            System.out.println("Sure, I will accept this offer");
        } else {
            System.out.println("Lets consider another offer or negotiate");
        }
    }
}
