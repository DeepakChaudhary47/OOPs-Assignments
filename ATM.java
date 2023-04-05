import java.util.Scanner;

public class ATM {

            private static int accountNumber;
            private static int pin;
            private static double balance = 1000000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bank Of Baroda ATM ,Balrampur !");

        System.out.print("\nEnter account number: ");
        accountNumber = scanner.nextInt();
        System.out.print("Enter PIN: ");
        pin = scanner.nextInt();

    
        if (!isValidAccount(accountNumber, pin)) {
            System.out.println("Invalid account number or PIN. Exiting........");
            return;
        }

        int choice = 0;
        while (choice != 6) {
            displayMenu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    withdrawCash();
                    break;
                case 3:
                    depositCash();
                    break;
                case 4:
                    changePin();
                    break;
                case 5:
                    displayMenu();
                    break;
                case 6:
                    System.out.println("Thank you for using the ATM!");
                    System.out.println("  Be Happy !!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static boolean isValidAccount(int accountNumber, int pin)
   {

        return accountNumber == 22717 && pin == 8900;
    }

    public static void displayMenu()
    {
        System.out.println("\nHello, Mr.Deepak Chaudhary");
        System.out.println(" \nPress Any Key To Make An Action:");
        System.out.println("\n1. Check balance");
        System.out.println("2. Withdraw cash");
        System.out.println("3. Deposit cash");
        System.out.println("4. Change PIN");
        System.out.println("5. Display menu");
        System.out.println("6. Exit");
    }

    public static void checkBalance() {
        System.out.print(balance);
    }

     public static void withdrawCash() 
     {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (balance < amount) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= amount;
            System.out.printf("Successfully withdrew $%.2f\n", amount);
            checkBalance();
        }
    }

    public static void depositCash() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        balance += amount;
        System.out.printf("Successfully deposited\n", amount);
        checkBalance();
    }

    public static void changePin() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter current PIN: ");
        int currentPin = scanner.nextInt();
        if (currentPin != pin) {
            System.out.println("Incorrect PIN.");
            return;
        }
        System.out.print("Enter new PIN: ");
        int newPin = scanner.nextInt();
        System.out.print("Confirm new PIN: ");
        int confirmPin = scanner.nextInt();
        if (newPin != confirmPin) {
            System.out.println("PINs do not match.");
            return;
        }
        pin = newPin;
        System.out.println("PIN successfully changed.");
    }

}
