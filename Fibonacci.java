import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter the N th term:");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int f1=0,f2=1,next_term;
        System.out.println("The fibonacci sequence:");
        for(int k=1;k<=n;k++)
        {
            for(int j=k;j<n;j++){
                System.out.print("  ");
            }
        
        for(int i=1;i<=k;i++)
        {
           next_term=f1+f2;
           System.out.printf("%4d", f1);
           f1=f2;
           f2=next_term;
        }
        System.out.println();

    }
    sc.close();
    }
    
}
