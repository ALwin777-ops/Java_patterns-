import java.util.*;
public class strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name1: ");
        String name1=sc.next();
        System.out.println("Enter name2: ");
        String name2=sc.next();
        boolean found=false;
        String fullname="";
        String Result="";
        System.out.println("Enter a valid mail id: ");
        String mail=sc.next();
        String eResult="";
        System.out.println("Checking the names are same: ");
        if(name1.equals(name2))
        {
            System.out.println("they are the same:" );
            found=true;
            //break;
        }
        else 
        {
            System.out.println("they aren't the same: ");
            System.out.println("Joining the name: ");
            fullname=name1+name2;
            System.out.println("my full name is : "+fullname);
            System.out.println("The length of the full name :"+fullname.length());
            for(int j=0;j<fullname.length();j++)
        {
            System.out.println(fullname.charAt(j));
        }
        }
        if(found==true){
            for(int j=0;j<name1.length();j++)
            {
                System.out.println(name1.charAt(j));
            }
        }
        if (!fullname.isEmpty())
        { 
        int n=name1.length();
        System.out.println(fullname.substring(0, n));
    }
    else {
        System.out.println("No valid fullname for substring operation.");
    }
        for(int i=0;i<fullname.length();i++){
        if(fullname.charAt(i)=='i')
        {
            Result=Result+'e';
        }
        else{
            Result+=fullname.charAt(i);
        }

    }
    System.out.println(Result);



    System.out.println("User_name:");
    for(int i=0;i<mail.length();i++){
        if(mail.charAt(i)=='@')
        {
           break;
        }
        else{
            eResult+=mail.charAt(i);
        }

    }
    System.out.println(eResult);

sc.close();
    }


    }
  

