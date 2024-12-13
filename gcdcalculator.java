import java.util.*;
public class gcdcalculator {
    public static int GCD(int a,int b)
    {
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return Math.abs(a);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=sc.nextInt();
        System.out.println("Enter the second number:");
        int b=sc.nextInt();
        System.out.println("the GCD of "+a+" and "+b+" is "+GCD(a, b));


    }
    

}
