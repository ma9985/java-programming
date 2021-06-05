package day50_inheritance;

import java.util.ArrayList;

public class InheritanceTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Mohammad";
        p1.age = 33;

        p1.talk();
        p1.walk();
        p1.work("SDET");

        Teacher t1 = new Teacher();
        t1.teacherID = 1234;
        t1.name = "Idris";
        t1.age = 2;
        t1.talk();
        t1.teach("java inheritance");

        Student student = new Student();
        student.name = "Idris";
        student.age = 33;
        student.walk();
        student.talk();
        student.work(" is working as Java Programming");
        student.school = "Cybertek School";
        student.study("Java Program inheritance");

    }
}
