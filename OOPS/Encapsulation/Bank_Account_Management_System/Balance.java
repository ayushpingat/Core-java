import java.util.Scanner;

public class Balance{
    
    private double balance;
    Scanner scanner=new Scanner(System.in);
    
    public void mybalance(){
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check balance");
        int opt=scanner.nextInt();
        switch(opt){
            case 1:
                deposit();
                break;
            case 2:
                withdraw();
                break;

                case 3:
                getBalance();
                break;

            }
    }

    public void deposit(){    
        System.out.println("enter the amt to be deposited");
        double amt=scanner.nextDouble();
        balance+=amt;
        System.out.println("Your amount is credited ");
    }

    public void withdraw(){ 
        System.out.println("enter the amt to be withdrawn");
        double amt=scanner.nextDouble();
        if(amt>balance){
            System.out.println("Insufficient balance");
        }
        else{
            balance-=amt;
            System.out.println("Your amount is debited ");
        }
    }
    public void getBalance(){
        System.out.println("Your balance is "+balance);
    }
}