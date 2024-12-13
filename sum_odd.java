import java.util.*;
public class sum_odd{
    
    public static void sumodd(int n) {
    int sum=0;
    for(int i=1;i<=n;i++){
        if(i%2==1)
        {
            sum=sum+i;
            
        }
        
    }
    System.out.println(sum);
 }
    public static void main(String[] args) {
        System.out.println("Enter the range:");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        sumodd(n);
        sc.close();
    }
       
}