import java.util.*;
public class Arraay {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        int[] mark=new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<size;i++){
            mark[i]=sc.nextInt();
        }
        System.out.println("Enter the element to search");
        int search =sc.nextInt();
        boolean found=false;
        for(int i=0;i<mark.length;i++){
            if(mark[i]==search)
            {
                System.out.printf("the element is found at postions %d ",i+1);
                found=true;
                break;
            }
            
        }
       if(!found)
            {
               System.out.println("The element is not in the array:");
            }

    }
}
