package ExampleOfCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class Ex02WrapperClassInCollections {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<String>();
        l.add("JAVA");
        l.add("PYTHON");
        l.add("JAVASCRIPT");
        l.add("APTITUDE");
        Iterator<String> i = l.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println("----------");

        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        Iterator<Integer> itr = al.iterator(); // 10 20 30
        while(itr.hasNext()) {
            Integer data = itr.next();
            System.out.println(data);
        }
        System.out.println("----------------------");
        Vector v = new Vector();
        v.add(10);
        v.add("guldu");
        v.add(3.5);
        Iterator it = v.iterator();
        while(it.hasNext()) {
/*Object obj = it.next();
System.out.println(obj);*/
            System.out.println(it.next());

                    }
    }
}
