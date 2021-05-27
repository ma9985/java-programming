package day34_void_methods;

public class etsySearchTest {
    public static void main(String[] args) {
        System.out.println("----Starting Etsy Smoke Test----");
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        verifyResultsAreDisplayed();

    }

    public static void openBrowser() {
        System.out.println("1.Launching Chrome Browser");
    }
    public static void navigateToEtsyUrl(){
        System.out.println("2.Go to url and type the website");
    }
    public static void searchForWoodenSpoon() {
        System.out.println("3.Go to the search bar and type 'Wooden Spoon");
        System.out.println("Pass: the verify search results");
    }
    public static void verifyResultsAreDisplayed() {
        System.out.println("4.Pass: to look to make sure the results are what you wanted");

        System.out.println("this test was successfully tested by: Mohammad");
        System.out.println("/PASS/");
    }
}


