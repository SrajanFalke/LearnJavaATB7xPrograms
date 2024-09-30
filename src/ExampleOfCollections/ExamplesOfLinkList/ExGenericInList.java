package ExampleOfCollections.ExamplesOfLinkList;

import java.util.Collection;
import java.util.LinkedList;

public class ExGenericInList {
    public static void main(String[] args) {
    LinkedList<String> l = new LinkedList<>();
    l.add("A");
        l.add("c");
    l.add("b");


    for (String s : l) {
        System.out.println(s);
    }
    }
}
