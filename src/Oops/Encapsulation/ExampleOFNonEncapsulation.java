package Oops.Encapsulation;

public class ExampleOFNonEncapsulation {
    public static void main(String[] args) {
        A a = new A("Srajan", "12345678");
        System.out.println(a.password);
        System.out.println(a.Username);
    }
}

class A {
    public String Username;
    public String password;

    public A(String username, String password) {
        this.Username = username;
        this.password = password;
    }
}
