package OffDayCoding;

/*
Given a person's name in a String (first and last name), then prints out the initials of the user.
The initials should be uppercase.
Ex:
input: james bond
output: your initials are JB
 */
public class LoopInitials {
    public static void main(String[] args) {
        String name = "james bond";
        int space = name.indexOf(" ");
        String initials = name.substring(0,1).toUpperCase();
        String initialsTwo = name.substring(6,7).toUpperCase();
        System.out.println(initials+initialsTwo);
    }
}
