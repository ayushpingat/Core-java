import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("Choose your option");
        System.out.println("1. Car");
        System.out.println("2. Bike");

        Scanner scanner= new Scanner(System.in);
        int opt=scanner.nextInt();
        scanner.nextLine();
        if(opt==1){

            System.out.println("Enter your car deatils:");
            
            System.out.println("Enter your car number: ");
            String vehicleno=scanner.nextLine();

            System.out.println("Enter your car name: ");
            String vehiclename=scanner.nextLine();

            System.out.println("Enter rent per days: ");
            int rentperday=scanner.nextInt();

            System.out.println("Enter number of days you want to rent: ");
            int days=scanner.nextInt();
            

            Vehicle c=new Car(vehicleno,vehiclename,rentperday);
  
            c.calrent(days);
            c.displaydetails();
        }
        else if(opt==2){

            System.out.println("Enter your bike deatils:");

            System.out.println("Enter your bike number: ");
            String vehicleno=scanner.nextLine();

            System.out.println("Enter your bike name: ");
            String vehiclename=scanner.nextLine();

            System.out.println("Enter rent per days: ");
            int rentperday=scanner.nextInt();

            System.out.println("Enter number of days you want to rent: ");
            int days=scanner.nextInt();
            

            Vehicle b=new Bike(vehicleno,vehiclename,rentperday);
            b.calrent(days);
            b.displaydetails();
        }
        else{
            System.out.println("Invalid option");
        }
    }
}
