package bankManagementSystem;

import java.util.Scanner;

public class BankAccount {
    Scanner sc = new Scanner(System.in);
    String cusName;
    String id;
    int balance;

    BankAccount(String cusName, String id){
        this.cusName = cusName;
        this.id = id;
    }

    int getBalance(){
        return balance;
    }

    void  deposit(int amount){
        if (amount > 0){
            balance += amount;
        }else
            System.out.println("Please enter correct amount.");
    }
    void withDraw(int amount){
        if (balance > amount){
            balance -= amount;
        }else
            System.out.println("Your balance is low.");
    }
    void show(){
        int input=0;
        System.out.println("Hello, "+ cusName);
        System.out.println("Your id no: "+id);
        System.out.println();
        System.out.println("Press 1 for check balance.");
        System.out.println("Press 2 for deposit money.");
        System.out.println("Press 3 for withDrew money.");
        System.out.println("Press 4 for exit.\n");
        //input = sc.nextInt();
        while (input != 4){
            input = sc.nextInt();
            switch (input){
                case 1:
                    System.out.println("Your balance is: "+ balance);
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    int amount = sc.nextInt();
                    deposit(amount);
                    break;

                case 3:
                    System.out.print("Enter withdraw amount: ");
                    int withdraw = sc.nextInt();
                    withDraw(withdraw);
                    break;

                default:
                    System.out.println("Thanks for using our service.");
                    break;
            }
        }

    }

}
