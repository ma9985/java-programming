package OfficeHours.OfficeHours_06_15_2021;

public class EmailObjects {
    public static void main(String[] args) {

        Email email = new Email("mohammad@cybertekschool.com", 43);
        System.out.println(email);

        System.out.println(Gmail.domain);
        System.out.println(Email.domain);
        System.out.println();

        Gmail gmail = new Gmail("Idris@gmail.com", 150);
        System.out.println(gmail);
        System.out.println(Email.domain);
        System.out.println(Gmail.domain);
        System.out.println();

        Yahoo yahoo = new Yahoo("Karim@yahoo.com", 88);
        //System.out.println(yahoo);
        System.out.println(Yahoo.domain);
    }
}
