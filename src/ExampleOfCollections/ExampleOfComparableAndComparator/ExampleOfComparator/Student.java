package ExampleOfCollections.ExampleOfComparableAndComparator.ExampleOfComparator;

//public class Student implements Comparable<Student>
public class Student {
    private int age;
    private String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Override
//    public int compare(Object o1, Object o2) {
//        return Integer.compare(this.age, (Integer) o1);
//    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }


//    @Override
////    public int compareTo(Student o) {
////        return Integer.compare(this.age, o.age);
////    }
//    public int compareTo(Student o) {
//        return CharSequence.compare(this.name, o.name);
//    }


}
