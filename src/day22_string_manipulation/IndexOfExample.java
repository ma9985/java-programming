package day22_string_manipulation;

public class IndexOfExample {
    public static void main(String[] args) {
        String technologies = "java, html, css, selenium, testing, maven, cucumber";
        System.out.println(technologies.indexOf(",")); //4 first comma
        System.out.println(technologies.lastIndexOf(",")); //41 last comma

        int indexOfJava = technologies.indexOf("java");
        System.out.println("java is at index " + indexOfJava); //java is at index 0

        int idxOfCss = technologies.indexOf("css");
        System.out.println("css is at index " + idxOfCss); //css is at index 12

        int idxOfCucumber = technologies.indexOf("cucumber");
        System.out.println("cucumber is at index " + idxOfCucumber); //cucumber is at index 43

        int indexOfSql = technologies.indexOf("sql");  // not present -1
        System.out.println("sql is at index " + indexOfSql);

        // technologies contains "maven" ?
        if (technologies.contains("mavens")) {
            System.out.println("maven is present");
        } else {
            System.out.println("maven is not present");
        }
        if (technologies.indexOf("maven") > -1){
            System.out.println("maven is present");
        }
        System.out.println("maven is not present");

        String country = "Belize";
        System.out.println(country.substring(2, 5));
    }


}
