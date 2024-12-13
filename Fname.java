import java.util.*;


public class Fname {

    public static int calculatsum(int a,int b)
    {
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("the numbers:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        //int sum=calculatsum(a,b);
        System.out.printf("the sum of %d + %d = %d ",a,b,calculatsum(a,b));
        
    }
    
}
