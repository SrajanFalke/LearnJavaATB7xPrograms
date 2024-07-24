package StringConstantPool;

public class Sample1 {
    public static void main(String[] args) {
        String emailId1 = new String("srjflk@gmail.com");
        String emailId2 = new String("srjflk1@gmail.com");
        emailId1 = emailId1.concat(".in");
        System.out.println("Now emailid1 is changed: " + emailId1);

        String emailId3 = "srjflk@gmail.com";
        String emailId4 = "srjflk@gmail.com";
        String emailId5 = "srajanflk@gmail.com";

        System.out.println(emailId5);

        emailId5 = emailId5.concat(emailId3);

        System.out.println("Now emailId5 is changed: " + emailId5);
    }
}