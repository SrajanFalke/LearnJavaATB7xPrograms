package ExampleOfCollections.MapInterface.ExamplesOfTreeMap;

import java.util.Set;
import java.util.TreeMap;

public class ExampleOfTreemap {
    public static void main(String[] args) {
        TreeMap<Integer, Character> t = new TreeMap<Integer, Character>();
        t.put(20, 'C');
        t.put(30, 'A');
        t.put(10, 'B');
        Set<Integer> s = t.keySet();
        for(int key : s) {
            System.out.println(key+" "+t.get(key));
        }
    }
}
