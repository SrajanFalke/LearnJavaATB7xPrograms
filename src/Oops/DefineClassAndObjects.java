package Oops;

public class DefineClassAndObjects {
// Class is a blueprint of the objects
//    Object is a instance of the class, means it a real entity, it is depending upon Attributes and Behavior.
    int a = 10;   //this are the states/Attribute of the objects.
    String s = "Walk daily 5 km"; //this are the states/Attribute of the objects.

    void run(){
//        this is the behaior of the objects
        System.out.println(a);
    }

    void walk(){
        System.out.println(s);
    }

    public static void main(String[] args) {
        DefineClassAndObjects d = new DefineClassAndObjects();
        d.run();
        d.walk();
    }
}
