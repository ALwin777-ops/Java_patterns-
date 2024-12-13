import java.util.*;
public class reversewing {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("hello world");
    for (int i=0;i<sb.length()/2;i++)
    {
        int front=i;
        int back=sb.length()-i-1;

        char frochar=sb.charAt(front);
        char back_char=sb.charAt(back);

         sb.setCharAt(front, back_char);
         sb.setCharAt(back, frochar);
    }
    System.out.println(sb);
        
    }
    
    
    
}
