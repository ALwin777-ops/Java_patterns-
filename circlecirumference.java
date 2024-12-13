import java.util.*;;

public class circlecirumference{



    public static float circum(int n){
      //  float cir=
        return(2*3.14f*n);
       

    }
    public static void main(String[] args) {
        System.out.println("Enter the valu of the radius: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //System.out.println("the value is "+factor(n));
        System.out.printf("circumference of a circle:%.2f ",+circum(n));
        sc.close();
    }
    
}
