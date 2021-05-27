package day19_class_vs_object_string;

import java.util.Locale;

public class StringCaseConversion {
    public static void main(String[] args) {
        String word = "CyberTek";
        System.out.println(word.toUpperCase());

        word.toLowerCase();
        System.out.println(word);

        String wordInLcase = word.toLowerCase();
        System.out.println("wordInCase = " + wordInLcase);

        word = word.toLowerCase();
        System.out.println("word = " + word);

        String company = "Amazon";
        System.out.println(company.toUpperCase());
        System.out.println("company in uppercase = " + company.toUpperCase());
        System.out.println("idris".toUpperCase());
        System.out.println("IDRIS".toLowerCase());


    }
}
