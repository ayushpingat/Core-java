import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to the Bank");
        System.out.println("Choose an option ");
        System.out.println("1. Create Account ");
        System.out.println("2. Manage Account ");
        Scanner scanner=new Scanner(System.in);
        int option=scanner.nextInt();
        if(option==1){
            Account a=new Account();
            a.createaccount();
        }
        else{
            Balance b=new Balance();
            b.mybalance();
        }

    }
    
}
