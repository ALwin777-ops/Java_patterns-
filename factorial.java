import java.util.*;
public class factorial {

    public static void factor(int n){
        int s=1;
        for(int i=1;i<=n;i++)
        {
            s=s*i;
            
        }
        System.out.println("the value is "+s);
        //return(s);

    }
    public static void main(String[] args) {
        System.out.println("Enter the value for n: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //System.out.println("the value is "+factor(n));
        factor(n);
        sc.close();
    }
    
}
