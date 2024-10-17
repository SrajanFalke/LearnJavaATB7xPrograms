package ExampleOfCollections.MapInterface.ExOfHashMap;

import java.util.HashMap;

public class ExampleOfHashMap {
    public static void main(String[] args) {
        HashMap<Object, Object> h = new HashMap();
// put() is used to add an entry(Key and Value Pair) into the Map
        h.put(100, "Java");
        h.put("Sql", 12.34);
        h.put(45.6, 555);
        System.out.println(h); // {100=Java, 45.6=555, Sql=12.34}
        System.out.println("-------------------");
// size() is used to calculate the no of entries
        System.out.println(h.size()); // 3
        System.out.println("-------------------");
// get() is used to return the value based on the key
        System.out.println(h.get(100)); // Java
        System.out.println(h.get(657)); // null
        System.out.println("-------------------");
// containsKey() will check if the key is present or not
        System.out.println(h.containsKey(100)); // true
        System.out.println(h.containsKey("sql")); // false
        System.out.println("-------------------");
// containsValue() will check if the Value is present or not
        System.out.println(h.containsValue("Java")); // true
        System.out.println("-------------------");
        System.out.println(h);
// remove() will remove the value based on the key
        h.remove(100);
        System.out.println(h);
        System.out.println("-------------------");
// isEmpty() is used to check if the Map is empty or not
        System.out.println(h.isEmpty());
// clear() will remove all entries from Map
        h.clear();
        System.out.println(h.isEmpty());
    }
}
