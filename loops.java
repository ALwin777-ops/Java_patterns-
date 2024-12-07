import java.util.*;

public class loops {

public static void main(String[] args) {
int i=1;
System.out.println("Enter a number:");
Scanner jam = new Scanner(System.in);
int number=jam.nextInt();


    do{
        int product=number*i;
        System.out.printf("%d * %d = %d\n",number,i,product);
        i=i+1;


    }while(i<11);
   
}    
}
