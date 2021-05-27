package OfficeHours.OfficeHours_03_29_2021;

import java.util.Locale;

/*
Given a String in the following format:
“Sender: <James Bond>. From Number: [202-123-3456].
Message: {“I love programming and problem solving}”

Separate these parts and print them separately:
“Sender: actualSender”
“Number: actualNumber”
“Message: actualMessage”
--------------------------------------------
 */
public class MiddleLetter {
    public static void main(String[] args) {
        String message = "Sender: [Mohammad] From Number<(222)-333-4444> Message:{Hello, lets code some java}";
        int start = message.indexOf("[");
        int end = message.indexOf("]");
        System.out.println(message.substring(start + 1, end)); //Nadir
        String sender = message.substring(start + 1, end);
        System.out.println("sender: " + sender);

        String mobile = message.substring(message.indexOf("<") + 1, message.indexOf(">"));
        System.out.println("Phone number: " + mobile);

        String text = message.substring(message.indexOf("{") + 1, message.indexOf("}"));
        System.out.println("Message: " + text);


        if (sender.equals("Mohammad")) {
            System.out.println("Print the message");
        } else {
            System.out.println("don't print");

        }
    }
}


