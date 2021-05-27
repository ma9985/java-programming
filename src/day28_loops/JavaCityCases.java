package day28_loops;
/*
int totalCases = 0;
loop day = 1 till day 30

every day there are 200 new cases

every sunday(day % 7 == 0) there are 500 new cases

"day 1 - daily cases: 200"
day 2 - daily cases: 400
--------------
print totalCases =
 */
public class JavaCityCases {
    public static void main(String[] args) {
        int totalCases = 0;


        for(int day = 1; day < 30; day++) {
            if(day % 7 ==0) {
                totalCases +=500;
            } else {
                totalCases +=200;
            }
            totalCases +=200;
            System.out.println("day " + day + "| total cases : " + totalCases );
           ;
        }
        System.out.println("JavaCityCases 03/2021 Total cases: " + totalCases);
    }

}
