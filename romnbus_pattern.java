import java.util.*;

public class romnbus_pattern {
    public static void main(String[] args) {
        System.out.println("Enter the value of n:");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}