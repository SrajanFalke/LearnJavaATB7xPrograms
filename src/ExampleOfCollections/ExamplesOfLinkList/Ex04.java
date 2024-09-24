package ExampleOfCollections.ExamplesOfLinkList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex04 {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        ar.add(10);
        ar.add(20);

        LinkedList l = new LinkedList();
        l.add(ar);
        l.add(30);

        System.out.println(l);

        System.out.println(l.contains(ar));
    }
}
