package day05_primitives_concatanation;

public class JobInfo {
    public static void main(String[] args) {
        String Title = "Java SDET";
        String Company = "AT&T";
        String jobDescription = "Experience in Java, Selenium, Cucumber, Tomato, Junit";
        double salary = 123000;
        byte yearsOfExp = 3;
        boolean hasBenefits = true;

        System.out.println("Title: " + Title);
        System.out.println("Company: " + Company);
        System.out.println("jobDescription: " + jobDescription);
        System.out.println("Salary: $" + salary);
        System.out.println("Years of Experience " + yearsOfExp);
        System.out.println("Has benefits? " + hasBenefits);

    }
}
