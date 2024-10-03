package ExampleOfCollections.ExampleOfSet;

import java.util.TreeSet;

public class ExampleOfTreeSet2 {
    public static void main(String[] args) {
        TreeSet<String> t = new TreeSet<String>();

        t.add("cat");
        t.add("Cat");
        t.add("Bat");
        for(String s : t) {
            System.out.println(s);
        }
    }
}
