package Oops.Encapsulation;

import Encapsulation.Teacher;

public class JrTeacher extends Teacher {
    public static void main(String[] args) {
        JrTeacher j = new JrTeacher();
        j.setCollegeName("Fiddu");
        System.out.println(j.getCollegeName());
    }
}
