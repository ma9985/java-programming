package day33_arrays;

import com.sun.xml.internal.ws.api.client.WSPortInfo;

/*
declare String array called friends
and assign all first names of your group friends

Loop through the names in friends array
and print
    Happy Holidays Baykt!
    Happy Holidays Mohammad!
 */
public class GroupFriends {
    public static void main(String[] args) {
        String[] friends = {"Mohammad", "Bakyt", "Soufyan", "Joe", "Idris", "Karim"};
        for(String names : friends) {
            System.out.println("Happy Ramadan " + names +"!");
        }
    }
}
