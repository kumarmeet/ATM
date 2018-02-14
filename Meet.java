package atm;
import java.util.*;
public class Meet
{
    private static double amount=2563514.215;
    private static String name="Meet Kumar";

    public static void check(){
        while(true){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Welcome "+name);
            System.out.println("1. Check Balance");
            System.out.println("2. Debit Amount");
            System.out.println("3. Deposit Amount");
            System.out.println("4. Logout");
            System.out.println("Enter your Choice");
            byte select=scanner.nextByte();
            switch(select){
                case 1:
                System.out.println(amount);
                break;
                case 2:
                System.out.println("Enter Debit Amount");
                double debit=scanner.nextDouble();
                amount=amount-debit;
                System.out.println("Your Debit Amount is "+amount);
                break;
                case 3:
                System.out.println("Enter Deposit Amount");
                double deposit=scanner.nextDouble();
                amount=amount+deposit;
                System.out.println("Your Deposit Amount is "+amount);
                break;
                case 4:
                System.exit(0);
                break;
            }
        }
    }
}

