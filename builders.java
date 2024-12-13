import java.util.*;
public class builders {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("tony");
        System.out.println(sb.charAt(0));
        sb.setCharAt(0, 's');
        System.out.println(sb);
        sb.insert(2, 'n');
        System.out.println(sb);
        sb.delete(2,3);
       System.out.println(sb);
       sb.append(" Stark");
       System.out.println(sb);
       sb.insert(5," Liston ");
       System.out.println(sb);
       sb.replace(4, 12," jerk ");
       System.out.println(sb);
       sb.length();
       System.out.println(sb.length());
       //sb.setLength(4);
       sb.setLength(5);
       System.out.println(sb);
       sb.reverse();
       System.out.println(sb);
    }
    
}
