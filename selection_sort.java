import java.util.*;
public class selection_sort {


    public static int[] select(int[] array)
    {
for(int i=0;i<array.length-1;i++)
{
    int smallest=i,temp;
    for(int j=i+1;j<array.length;j++)
    {
        if(array[smallest]>array[j])
        {
            smallest=j;
        }
        
    }
   /*int temp = arr[smallest];
           arr[smallest] = arr[i];
           arr[i] = temp;
 */

 temp=array[smallest];
 array[smallest]=array[i];
 array[i]=temp;


 System.out.println("Step " + (i + 1) + ": " + Arrays.toString(array));
}

return array;
    }
    public static void main(String[] args) {
        System.out.printf("Enter the size of the array:");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] array=new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.printf("Enter the %d element of the array:",i+1);
            array[i]=sc.nextInt();
        }

        int[] sorted= select(array);

        System.out.println("The Sorted array:");
        for(int i=0;i<size;i++)
        {
            System.out.printf(sorted[i]+" ");
            
        }

        sc.close();

    }
    
}
