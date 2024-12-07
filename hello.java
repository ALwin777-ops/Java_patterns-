
import java.util.*;


public class hello{
    public static void main(String[] args) {

float R;
while (true) {
    

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer for A: ");
        int a=sc.nextInt();
        System.out.print("Enter an integer for B: ");
        int b=sc.nextInt();
        System.out.print("Enter the sign for the operation:\n1) ADD\n2) SUB\n3) DIV\n4) MUL ");
        int c=sc.nextInt();
        switch (c) {
            case 1:
            R = a + b;
            System.out.print(R);
                break;
            case 2:
                    R = a - b;
                    System.out.print(R);
                    break;
                case 3:  // Division
                    if (b != 0) { // Check for division by zero
                        R = (float) a / b; // Cast to float for decimal result
                        System.out.println("Result: " + R);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
           case 4:
            R = a * b;
            System.out.print(R);
                break;
                
            default:
            System.out.println("error");
                break;
        }

        System.out.print("\n Do you want to perform another calculation? \n 1=yes:\n 2=no: ");
        int j = sc.nextInt();
        if (j==2) {
            break;
            
        }
    }
        
       
    }
}


