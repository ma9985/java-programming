package UnitOneProblemStudyGuide;
import com.sun.xml.internal.ws.api.client.WSPortInfo;

import java.util.Scanner;

public class PersonalInformation1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many people do you live with?:");
        int peopleInHouse = input.nextInt();

        if (peopleInHouse < 2) {
            System.out.println("Lives with less than 2 people");
        } else if (peopleInHouse > 3 && peopleInHouse < 6) {
            System.out.println("Lives with 3-6 people");
        } else if (peopleInHouse >= 6) {

        }
        System.out.println("Where do you live?");
        String city = input.next();
        System.out.println("Do you live downtown?");
        String answer = input.next();
        System.out.println("Have you thought about moving to the suburbs?");
        String answerTwo = input.next();
        if (answerTwo.equals("yes")) {
            System.out.println("do it its great");
        } else if (answerTwo.equals("No")) {
                System.out.println("You should think about it");
            }
        System.out.println("What is you favorite animal?");
        String favoriteAnimal = input.next();
        System.out.println("Wow, that " + favoriteAnimal + " is a great animal");
        System.out.println("how many pets do you want?");
        String howManyPets = input.next();
        System.out.println("interesting, do you want " + howManyPets +
                " pets and your favorite animal is a " + favoriteAnimal);
        }


}