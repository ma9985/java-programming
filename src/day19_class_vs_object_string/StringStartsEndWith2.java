package day19_class_vs_object_string;

public class StringStartsEndWith2 {
    public static void main(String[] args) {
        String url = "https:/www.stackoverflow.edu";
        if(url.endsWith(".com")) {
            System.out.println("commercial website");
        } else if (url.endsWith("ru")) {
            System.out.println("russian website");
        } else if(url.endsWith(".gov")) {
            System.out.println("government website");
        } else if(url.endsWith("edu")) {
            System.out.println("educational website");
        } else if(url.endsWith("org")) {
            System.out.println("Organization website");
        } else {
            System.out.println("These are all types of URL's");
        }
    }
}
