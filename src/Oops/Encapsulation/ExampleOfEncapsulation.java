package Oops.Encapsulation;

public class ExampleOfEncapsulation {
    public static void main(String[] args) {
        B b = new B("Srajan", "12345678");
        System.out.println(b.getUsername());
        b.setUsername("SrajanFalke");
        System.out.println(b.getUsername());
        System.out.println(b.getPassword());
        b.setPassword("falke123",true);
        System.out.println(b.getPassword());
    }
}

class B {
    private String Username;
    private String password;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, Boolean IsAuth) {
        if (IsAuth) {
            this.password = password;
        }else {
            System.out.println("Not allowed");
        }
    }

    public B(String username, String password) {
        this.Username = username;
        this.password = password;
    }
}
