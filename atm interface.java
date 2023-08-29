import java.util.Scanner;
//Task 4: ATM machine interface
public class ATM {
    private static Scanner scanner=new Scanner(System.in);
    private static double balance=1000.0;
    public static void main(String[]args) {
        Boolean quit = false;
        while (!quit) {
            printMenu();
            int choice = getUserChoice();
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    quit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
        public static void printMenu() {
            System.out.println("ATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
        }

        public static int getUserChoice(){
            System.out.print("Enter your choice: ");
            return scanner.nextInt();
        }
        private static void checkBalance() {
        System.out.println("Current Balance: Rs." + balance);
    }

    private static void deposit() {
        System.out.print("Enter deposit amount: Rs.");
        double amount = scanner.nextDouble();
        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else {
            System.out.println("rs."+amount+"deposited successfully");
        }
    }

    private static void withdraw() {
        System.out.print("Enter withdrawal amount: Rs.");
        double amount = scanner.nextDouble();
        if (amount <= 0 ||amount>balance) {
                System.out.println("Invalid amount.");
            }
        else {
            balance-=amount;
            System.out.println("Please take your cash. Rs."+amount);
        }
    }
}