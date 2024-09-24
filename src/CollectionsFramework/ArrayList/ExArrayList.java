package CollectionsFramework.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ExArrayList {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(10);
        l.add(10.5f);
        l.add(true);
        l.add("Srajan");
        l.add('a');

        System.out.println(l);
        System.out.println(l.size());
        System.out.println(l.get(3));
        System.out.println(l.contains("srajan"));
        System.out.println(l.contains("Srajan"));
        l.remove(3);
        System.out.println(l);
        System.out.println(l.isEmpty());
        l.clear();
        System.out.println(l.isEmpty());
    }
}
