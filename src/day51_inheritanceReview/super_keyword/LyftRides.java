package day51_inheritanceReview.super_keyword;

public class LyftRides {
    public static void main(String[] args) {
        Lyft lyftRide = new Lyft();
        LyftXL LyftXlRide = new LyftXL();
        Lux LuxRide = new Lux();

        System.out.println("Lyft Ride for 5 miles = $" + lyftRide.calculateRate(5));
        System.out.println("Lyft XL ride for 5 miles = $" + Math.round(LyftXlRide.calculateRate(5)));
        System.out.println("Lyft XL ride for 5 miles = $" + LuxRide.calculateRate(5));
    }
}
