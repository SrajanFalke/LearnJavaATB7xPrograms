package ExampleOfCollections.ExampleOfSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ExampleOfHashset {
    public static void main(String[] args) {
        Set hs = new HashSet();
        hs.add(10);
        hs.add(10);
        hs.add(10.5);
        hs.add(null);
        hs.add(null);
        hs.add("Dinga");
        System.out.println("SIZE:"+hs.size());

        System.out.println("---------");
        for(Object obj : hs) {
            System.out.println(obj);
        }
        System.out.println("----------------------");
        HashSet a = new HashSet(); // IC=16
        HashSet b = new HashSet(30); // IC=30
        HashSet c = new HashSet(10, 1.5f); // IC=10

        LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
        lhs.add(20);
        lhs.add(30);
        lhs.add(20);
        lhs.add(10);
        for(int i : lhs) {
            System.out.println(i);
        }
    }
}
