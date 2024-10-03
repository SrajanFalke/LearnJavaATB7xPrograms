package ExampleOfCollections.ExampleOfSet;

import java.util.TreeSet;

public class ExampleOfTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<Integer>();
        t.add(30);
        t.add(40);
        t.add(20);
        t.add(30);
        t.add(50);
        t.add(10);
        for(Integer i : t) {
            System.out.println(i);
        }
    }
}
