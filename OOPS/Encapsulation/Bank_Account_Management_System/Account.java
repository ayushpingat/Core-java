import java.util.Scanner;
public class Account{
    private String name;
    private String email;
    private int age;
    public void createaccount(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Create account");
        System.out.println("Enter your name");
        name=scanner.nextLine();
        System.out.println("Enter your email");
        email=scanner.nextLine();
        System.out.println("Enter your age");
        age=scanner.nextInt();
        System.out.println("Your Account is Created");
    }
}