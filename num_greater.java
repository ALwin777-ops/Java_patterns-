import java.util.*;
public class num_greater{
    public static int numgreater(int a,int b)
    {
        if(a>=b)
        {
            return a;
        }
        else 
        {
            return b;
        }
    }
    

    public static void main(String[] args) {
        System.out.println("Enter the numbers:");
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.printf("the number %d is greater among %d and %d",numgreater(a,b),a,b);
        sc.close();
    }
       
}