import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        System.out.print("Enter the amount to be paid:");
        int amount=new Scanner(System.in).nextInt();
        System.out.println("Paying amount: " + amount);
        System.out.println("Payment types available: UPI, Card, Cash");
        System.out.print("Enter the payment type:");
        String paymenttype=new Scanner(System.in).nextLine();
        if(paymenttype.equals("UPI")){
            Payment p= new UPI();
            p.pay(amount);
        }
        else if(paymenttype.equals("Cash")){
            Payment p=new Cash();
            p.pay(amount);
        }
        else if(paymenttype.equals("Card")){
            Payment p= new Card();
            p.pay(amount);
        }
        else{
            System.out.println("No such kind of payment available");
        }
        
    }
}