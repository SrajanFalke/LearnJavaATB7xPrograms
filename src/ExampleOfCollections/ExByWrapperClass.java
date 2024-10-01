package ExampleOfCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class ExByWrapperClass {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(10);
        l.add(20);
        l.add(30);
        Iterator<Integer> itr = l.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("-------");
        for(int i=0; i<l.size(); i++) {
            System.out.println(l.get(i));
        }
        System.out.println("-------");
        for(int i : l) {
            System.out.println(i);
        }
    }

}
