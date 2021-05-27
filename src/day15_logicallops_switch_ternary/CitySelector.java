package day15_logicallops_switch_ternary;


import javax.xml.bind.SchemaOutputResolver;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Moscow";
        String city2 = "Ramallah";
        String teacher = "Nadir";
        //moscow or (||) ramallah
        if (city.equals("Moscow") || city2.equals("Ramallah")) {
            System.out.println("Willing to relocate to- " + city);
        } else {
            System.out.println("Not willing to relocate- " + city);
        }
        if(teacher.equals("Saim") || teacher.equals("Murodil")) {
            System.out.println("java class " + teacher);
        } else {
            System.out.println("Some other class with " + teacher);
        }

        String company = "AT&T";
        double salary = 112000;

        if (company.equals("AT&T") || salary >= 112000) {
            System.out.println("Accepting offers from " + company);
        } else {
            System.out.println("Rejecting job offers from " + company);
        }

    }
}
