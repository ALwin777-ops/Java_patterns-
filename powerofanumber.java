import java.util.*;
public class powerofanumber {
    public static void main(String[] args) {
        int power=1;
        System.out.println("Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another (X raised to N)" );
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of X:");
        int x=sc.nextInt();
        System.out.println("enter the value of N:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            power=power*x;
        }
        System.out.println("the power of the number is: "+power);

    }
    
}
