import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

class BankAccount {
    public static void main(String[] args) {
        welcome();
    }

    public static void welcome() {
        System.out.println();
        System.out.println("########################################");
        System.out.println("                                       #");
        System.out.println("Welcome to your Bank Account.          #");
        System.out.println("Please select from one of the options. #");
        System.out.println("                                       #");
        System.out.println("########################################");
        displayOptions();
    }

    public static void displayOptions() {
        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println("[1] - Create New Account");
        System.out.println("[2] - Deposit an Amount");
        System.out.println("[3] - Withdraw an Amount");
        System.out.println("[4] - Check Balance");
        System.out.println("[5] - Exit");
        System.out.println();
        System.out.println("Select one of the options by typing the number.");
        String selection = input.nextLine();
        int x = Integer.parseInt(selection);

        System.out.println("#############################################################");
        System.out.println("                                                            #");
        System.out.println("Your selection:                                             #");
        System.out.println(inputSelection(x));
        System.out.println("                                                            #");
        System.out.println("                                                            #");
        System.out.println("Press [1] to Continue | Press [2] to Return to Main Menu    #");
        System.out.println("                                                            #");
        System.out.println("#############################################################");
    }

    public static String inputSelection(int selection) {
        String result = "";
        switch (selection) {
            case 1:
                result = "You have selected to Create a New Account";
                break;
            case 2:
                result = "You have selected to Deposit an Amount";
                break;
            case 3:
                result = "You have selected to Withdraw an Amount";
                break;
            case 4:
                result = "You have selected to Check Balance";
                break;
            case 5:
                result = "You have selected to Exit";
                break;
        }
        return result;
    }
}