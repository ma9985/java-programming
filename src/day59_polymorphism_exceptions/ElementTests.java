package day59_polymorphism_exceptions;

public class ElementTests {
    public static void main(String[] args) {
        Link link = new Link();
        link.click();
        link.getLinkHref();
        link.getText();
        link.sendKeys("hi");


        WebElement loginLink = new Link();
        loginLink.click();
        String txt = loginLink.getText();
        System.out.println("txt " + txt);

        WebElement userName = new InputField();
        userName.sendKeys("Wooden Spoon");
        userName.click();


        WebElementUtil.clickElement(loginLink);
        WebElementUtil.clickElement(userName);


        WebElement login = WebElementUtil.getLinkWithText("login");
        login.click();
    }
}
