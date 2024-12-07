public class Rpattern {
    public static void main(String[] args) {

        int n=5;
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {

                //System.out.printf("%d",j);
               if(j%2==1)
               {
                System.out.printf("1\t");
               }
               else {
                System.out.printf("0\t");
               }
            }
            System.out.println();
        }
    }
    
}
