package ForEachLoop;

public class ForEachDemo1 {
    public static void main(String[] args) {
        int[] a = {10, 20, 30};

        
        for(int i : a) {
            System.out.println(i);
        }
        System.out.println("-----------");

        double[] marks = {45.6, 78.9, 32.7};

        for(double x : marks) {
            System.out.println(x);
        }
        System.out.println("------------");
        String[] mobiles = {"Sony", "Samsung", "Apple"};

        for(String mobile : mobiles) {
            System.out.println(mobile);
        }
    }
}
