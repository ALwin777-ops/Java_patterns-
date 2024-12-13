import java.util.*;
public class program_for_2D_array {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the row:");
    int row=sc.nextInt();
    System.out.println("Enter the column:");
    int col=sc.nextInt();
    int[][] mat=new int [row][col];
   // System.out.println("Enter the elements:");
    for(int i=0;i<row;i++)
    {
    for(int j=0;j<col;j++)
    {
        System.out.printf("Enter the elements of[%d][%d]:\t",i,j);
        mat[i][j]=sc.nextInt();
    }
    }

    for(int i=0;i<row;i++)
    {
    for(int j=0;j<col;j++)
    {
        System.out.print( mat[i][j]+" ");
       
    }
    System.out.println(" ");
    }

    System.out.println("Enter the number to search:");
    int search_num=sc.nextInt();
    boolean found=false;
    for(int i=0;i<row;i++)
    {
    for(int j=0;j<col;j++)
    {
        if(mat[i][j]==search_num)
        {
            System.out.printf("the element is found at postions [%d][%d] ",i,j);
            found=true;
            break;
        }
       
    }
    
    }
    if(!found)
    {
        System.out.println("The intended number"+search_num+" not found");
    }



    }
}
