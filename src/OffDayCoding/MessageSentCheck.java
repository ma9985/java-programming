package OffDayCoding;
/*
Given a String variable with a message. You will check if the message contains any of these bad words: “idiot, dumb, heck”
    -> If the message contains any of those words print: “Message not sent”.
    -> If the message is bad word free print “Message sent”
 */
public class MessageSentCheck {
    public static void main(String[] args) {
        String message = "idiot, dumb, heck";

        if(message.contains("heck") && message.contains("dumb") && message.contains("heck")) {
            System.out.println("message not sent");
        } else {
            System.out.println("sent message");
        }

    }
}
