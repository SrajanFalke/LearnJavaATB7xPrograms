package ExampleOfCollections.ExamplesOfArrayList.SortinginArrayList;

import java.util.Comparator;

public class SortByName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return CharSequence.compare(o1.getName(), o2.getName());
    }
}
