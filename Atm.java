package includeatm;
import atm.Meet;
import java.util.*;
class Atm
{
    public static void main(String []args)
    {
        System.out.print("Enter Your Password: ");
        Scanner scanner=new Scanner(System.in);
        int password=scanner.nextInt();
        if(password==1234)
        {
            Meet.check();
        }
        else{
            System.out.println("Wrong Input");
        }
    }
}