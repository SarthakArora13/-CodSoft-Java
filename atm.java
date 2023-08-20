import java.util.Scanner;
class user{
    static int acc_no=20235, bal=2000;
    static String name="Sarthak";

}
public class atm extends user{
    static void withdrawn(int amt){
        if(amt>bal){
            System.out.print("Insufficient Balance");
        }
        else {
            bal = bal - amt;
            System.out.println("Withdrawn Successful");
        }
        }
    static void deposit(int amt){
        bal=bal+amt;
        System.out.println("Amount Deposited");
    }
    static void show(){
        System.out.println("Your balance is "+bal);
    }
    public static void main(String arg[]){
        int c=0 ;
        int amount,pass=123,w;
        atm user=new atm();
        Scanner s=new Scanner(System.in);
        while(c!=4) {
            System.out.println("----------ATM----------");
            System.out.println("---Select the Option---");
            System.out.println("Enter 1 for Check the Balance");
            System.out.println("Enter 2 for Deposit");
            System.out.println("Enter 3 for Withdrawn the Cash");
            c = s.nextInt();
            switch(c) {
                case 1:
                    show();
                    break;
                case 2:
                    System.out.println("Enter the Amount");
                    amount = s.nextInt();
                    deposit(amount);
                    break;
                case 3:
                    System.out.println("Enter the Amount");
                    amount = s.nextInt();
                    withdrawn(amount);
                    break;

                case 4:
                    System.out.println("Enter Password to Break");
                    w = s.nextInt();
                    if (pass == w) {
                        break;
                    }
                    else{
                        System.out.println("Wrong Password");
                    }
//                    break;
//                    continue;
                default:
                    System.out.println("Entered Option is not valid");
                    break;
            }
        }
        }
}

