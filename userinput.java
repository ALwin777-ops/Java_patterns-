import java.util.*;
public class userinput {

    public static int  avg(int a,int b,int c)
    {
        int sum;
       return(sum=(a+b+c)/3);

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("the Average of the numbers are:"+avg(a,b,c));
        sc.close();
    }
    
}