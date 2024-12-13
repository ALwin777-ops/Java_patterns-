import java.util.*;
public class bubble_sorting {


    public static int[] sortt(int[] aray){
        int temp=0;
        for(int i=0;i<aray.length-1;i++)
        {
            for(int j=0;j<aray.length-i-1;j++)
            {
                if(aray[j]>aray[j+1])
                {
                    temp=aray[j];
                    aray[j]=aray[j+1];
                    aray[j+1]=temp;
                }
            }
        }

 return aray;
 }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size= sc.nextInt();
        int[] aray=new int[size];//int[] mark=new int[size];
       // System.out.println("Enter the elements of the array:");
        for(int i=0;i<size;i++)
        {
            System.out.printf("Enter the %d element of the array:",i+1);
            aray[i]=sc.nextInt();
        }
        
        int[] sorrtted=sortt(aray);
        System.out.println("The sorted elements:");
        for(int i=0;i<aray.length;i++)
        {
            System.out.print(sorrtted[i]+" ");
        }
        sc.close();
    }
    
    
}
