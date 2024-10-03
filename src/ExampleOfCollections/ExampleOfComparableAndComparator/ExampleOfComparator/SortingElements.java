package ExampleOfCollections.ExampleOfComparableAndComparator.ExampleOfComparator;

import java.util.ArrayList;
import java.util.Collections;

public class SortingElements {
    public static void main(String[] args) {
        Student s1 = new Student(21, "Srajan");
        Student s2 = new Student(20, "Shanky");
        Student s3 = new Student(23, "chinu");

        ArrayList<Student> ar = new ArrayList<Student>();
        ar.add(s1);
        ar.add(s2);
        ar.add(s3);

        Collections.sort(ar, new  SortByName());
        System.out.println(ar);

        Collections.sort(ar, new SortbyID());
        System.out.println(ar);

    }
}