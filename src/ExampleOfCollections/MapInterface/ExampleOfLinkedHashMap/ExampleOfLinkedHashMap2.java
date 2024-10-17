package ExampleOfCollections.MapInterface.ExampleOfLinkedHashMap;

import java.util.LinkedHashMap;

public class ExampleOfLinkedHashMap2 {
    public static void main(String[] args) {
        LinkedHashMap l = new LinkedHashMap();
        l.put(10, "Ambani");
        l.put(20, "Bezos");
        System.out.println(l);
        l.put(10, "Gates");
        System.out.println(l);
    }
}
