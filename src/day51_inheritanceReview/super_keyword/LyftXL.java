package day51_inheritanceReview.super_keyword;

public class LyftXL extends Lyft {
    @Override
    public double calculateRate(double miles) {
        return super.calculateRate(miles) * 1.1 ;
    }
}
