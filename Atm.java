import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        int pin = 2002;
        int balance = 10000;
        int add_amount = 0;
        int take_amount = 0;

        String name;
        Scanner sc = new Scanner(System.in);
        //take pin from user
        System.out.println("Enter your pin :");
        int password = sc.nextInt();
        //code
        if(password == pin){
            System.out.println("Enter your name");
            name = sc.next();
            System.out.println("Welcome"+name);
        while(true){
            System.out.println("Press 1 to Check your balance");
            System.out.println("Press 2 to Add amount");
            System.out.println("Press 3 to Take amount");
            System.out.println("Press 4 to Take receipt");
            System.out.println("Press 5 to Exit");

            int option = sc.nextInt();
            switch (option){
                case 1:
                    System.out.println("your current balance is "+" "+balance);
                    break;
                case 2:
                    System.out.println("How much amount you want to add to your account");
                    add_amount = sc.nextInt();
                    System.out.println("Successfully credited");
                    balance = add_amount + balance;
                    break;
                case 3:
                    System.out.println("How much amount do you want to take");
                    take_amount = sc.nextInt();
                    if(take_amount>balance){
                        System.out.println("Insufficient balance");
                        System.out.println("try on your range");
                    }
                    else{
                        System.out.println("Successfully taken");
                        balance = balance - take_amount;
                    }
                    break;
                case 4:
                    System.out.println("Welcome to SBI");
                    System.out.println("Available balance is"+" "+balance);
                    System.out.println("Amount deposited"+" "+add_amount);
                    System.out.println("Amount taken"+" "+take_amount);
                    System.out.println("**Thank you**");
                    break;
            }
            if(option == 5){
                System.out.println("Thank you!!");
                break;
            }
        }
        }
            else{
            System.out.println("Wrong pin number");
        }
    }
}
