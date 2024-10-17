package ExampleOfCollections.MapInterface.ExampleOfLinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Set;

public class ExampleOfLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> l = new LinkedHashMap<Integer, String>();
        l.put(10, "Apple");
        l.put(20, "Nokia");
        l.put(30, "OnePlus");
        Set<Integer> s = l.keySet();
        for(int key : s) {
            System.out.println(key+" -> "+l.get(key));
        }
        System.out.println("--------------");
        LinkedHashMap<String, Double> lhm = new LinkedHashMap<String, Double>();
        lhm.put("Tom", 5.4);
        lhm.put("Jerry", 5.2);
        Set<String> setOfKeys = lhm.keySet();
        for(String key : setOfKeys) {
            System.out.println(key+" "+lhm.get(key));
        }
    }
}
