import java.util.*;;
public class userdefined {
    public static void main(String[] args) {
        //System.out.println("Hello");
        char choice;
        int postive_number=0,negative_number=0,zero_number=0;
        do{
            System.out.print("Enter a number:");
            Scanner sc= new Scanner(System.in);
            int num=sc.nextInt();
            
            if(num>0)
            {
                postive_number++;
            }
            else if(num<0)
            {
                negative_number++;
            }
            else
            {
                zero_number++;
            }
            System.out.print("do wish to continue or nor:(y/n)");
            choice =sc.next().toLowerCase().charAt(0);

        }while(choice=='y');
        int total_numbers=zero_number+negative_number+postive_number;
        System.out.println("Here is your summary:");
        System.out.println("the total number of  numbers entered is:\t"+total_numbers);
        System.out.println("the total number of postive numbers entered is:\t"+postive_number);
        System.out.println("the total number of negative numbers entered is:"+negative_number);
        System.out.println("the total number of zeros entered is:\t"+zero_number);

    }
}
