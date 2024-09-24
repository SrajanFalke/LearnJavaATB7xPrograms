package ExampleOfCollections.ExamplesOfLinkList;

import java.util.LinkedList;

public class Ex03 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);

        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }

        System.out.println(l.contains(10));

        System.out.println(l.clone());

        System.out.println(l.lastIndexOf(10));
    }
}
