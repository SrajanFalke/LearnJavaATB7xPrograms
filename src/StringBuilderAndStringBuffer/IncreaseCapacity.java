package StringBuilderAndStringBuffer;

public class IncreaseCapacity {
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder();
        //default capacity 16
        System.out.println("Current Capacity: "+sb.capacity());

        //appended string is 13 chars, can be adjusted in current
        //capacity so no capacity increase
        sb.append("BeginnersBook");
        System.out.println("Current Capacity: "+sb.capacity());

        //Need to increase capacity to append
        //this string. (16*2) +2 = 34
        sb.append("Book");
        System.out.println("Current Capacity: "+sb.capacity()); //34
    }
}
