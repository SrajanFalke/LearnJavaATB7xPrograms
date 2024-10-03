package ExampleOfCollections.ExampleOfComparableAndComparator.ExampleOfComparable;

import java.util.TreeSet;

public class SortByTreeset {
    public static void main(String[] args) {
        Employee e1 = new Employee(30, "B");
        Employee e2 = new Employee(10, "C");
        Employee e3 = new Employee(20, "A");
        TreeSet<Employee> t = new TreeSet<Employee>();
        t.add(e1);
        t.add(e2);
        t.add(e3);

        for(Employee emp : t) {
            System.out.println(emp);
        }
    }
}
