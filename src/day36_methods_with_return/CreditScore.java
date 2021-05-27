package day36_methods_with_return;

public class CreditScore {
    public static void main(String[] args) {
                checkEligible(801);
                checkEligible(780);
        System.out.println(getCreditScore());
        System.out.println("CreditScore = " + getCreditScore());
        int score = getCreditScore();
        System.out.println("Score = " + score);
    }
    public static void checkEligible(int creditScore) {
        if(creditScore >= 700) {
            System.out.println("you are eligible");
        } else {
            System.out.println("not eligible");
        }
        //with out parameters:
        }
        public static int getCreditScore() {
            return 800;
    }

}
