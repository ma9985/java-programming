package day59_polymorphism_exceptions;

public class InputField implements WebElement{

    public String getValue() {
        System.out.println("Getting value in the InputField");
        return "selenium";
    }
    @Override
    public void sendKeys(String txt) {
        System.out.println("Typing into input field " + txt);
    }

    @Override
    public void click() {
        System.out.println("Clicking on a button ");
    }

    @Override
    public String getText() {

        return null;
    }
}
