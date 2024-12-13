import java.util.*;

public class vote {

public static int agetovote(int n)
{
    if(n>=18)
    {
        return 1;
    }
    else{
        return 0;
    }
}

    public static void main(String[] args) {
        int k;
        System.out.println("Enter Age: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=agetovote(n);
        if(a==1)
        {
            System.out.println("hey he can vote:");
        }
        else{
            k=18-n;
            System.out.printf("i need %d years to vote:",k);
        }
        
        sc.close();
    }
}
