package ExampleOfCollections.ExamplesOfArrayList;

import java.util.ArrayList;

public class ExboxingAndUsingObject {
    public static void main(String[] args) {
        int a = 10;
        char b = 'A';
        ArrayList l = new ArrayList();
        l.add(new Integer(a));
        l.add(new Character('A'));
        l.add(1.5); // l.add(new Double(1.5));
        for(Object obj : l) { // Upcasting
            System.out.println(obj);
        }
    }
}
