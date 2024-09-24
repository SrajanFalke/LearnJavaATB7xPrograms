package ExampleOfCollections.ExamplesOfArrayList;

import java.util.ArrayList;
import java.util.List;

public class Ex02 {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(10);
        l.add("Sk");
        l.add('a');

        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
    }
}
