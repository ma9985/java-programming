package day48_constructors_static;

import java.util.Arrays;

public class CybertekGroup {
    public static void main(String[] args) {
        Group group1 = new Group("Cyberbugs");  //dependency injection

        //print size of members
        System.out.println(group1.getMembers().size());

        group1.setMembers(Arrays.asList("Berk","Pavel","Elvin","Ali","Parvin","Rasim","Maria"));
        System.out.println(group1.getMembers());

        Group group2 = new Group("CyberCats");
        group2.setMembers(Arrays.asList("Mohammad", "Idris", "Jinan", "Karim"));
        //print all members. not toString()
        System.out.println("group2 members = " + group2.getMembers());

        if(group2.getMembers().contains("Akrem")){
            System.out.println("Akrem is member of group2");
        } else {
            System.out.println("IS not part of the group2");
        }
        //remove some member from group1
        group1.removeMember("Mohammad");
        group2.removeMember("Idris");

    }


}
