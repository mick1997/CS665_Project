package BeverageVendingMachine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VendingMachineSimulation {

    public static void main(String[] args) {

        // given two String array for input parameter
        String[] coffee = {"Espresso", "American", "Latte Macchiato"};
        String[] tea = {"Black Tea", "Green Tea", "Yellow tea"};

        // create beverage object and pass the value into parameter
        // create option for user to input
        Beverage beverage = new Beverage(coffee, tea);
        Scanner input = new Scanner(System.in);
        int option;

        // the do while loop for user to input number from 1 to 7
        // pick the beverage choose that user like or exit
        do {
            menu();
            try {
                option = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("The option should be an integer value. Try again!");
                break;
            }
            switch (option) {
                case 1:
                    beverage.showDrink(coffee[0]);
                    addMilk();
                    addSugar();
                    break;
                case 2:
                    beverage.showDrink(coffee[1]);
                    addMilk();
                    addSugar();
                    break;
                case 3:
                    beverage.showDrink(coffee[2]);
                    addMilk();
                    addSugar();
                    break;
                case 4:
                    beverage.showDrink(tea[0]);
                    break;
                case 5:
                    beverage.showDrink(tea[1]);
                    break;
                case 6:
                    beverage.showDrink(tea[2]);
                    break;
                case 7:
                    System.out.println("Thank you for choose the beverage vending machine.\nPlease use again!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option, The option should be 1 ~ 9\n");
                    break;
            }
        } while (true);
    }

    // the menu static menu method takes no parameter, just print menu option
    private static void menu() {

        System.out.println("\nWelcome to the Beverage Vending Machine!!!\n" +
                           "\n========================================" +
                           "\nPlease choose the beverage shown below or Exit:" +
                           "\n1. Espresso" + "\n2. American" + "\n3. Latte Macchiato" +
                           "\n4. Black Tea" + "\n5. Green Tea" + "\n6. Yellow Tea" +
                           "\n7. Exit!!!" +
                           "\n========================================");
    }

    // the static addMilk method takes no parameter with boolean isFinishedAdd,
    // if the user has add more than 3 units of milk, then print warning message
    private static void addMilk() {

        Scanner input = new Scanner(System.in);
        boolean isFinishedAdd = false;

        while (!isFinishedAdd) {
            System.out.println("\nPlease choose the amount of Milk that you would like to add between [0 ~ 3 units]!");
            int unitsOfMilk = input.nextInt();
            if (unitsOfMilk >= 0 && unitsOfMilk <= 3) {
                System.out.println("\nYou have add " + unitsOfMilk + " unit of milk to your drink already!");
                isFinishedAdd = true;
            }
            else {
                System.out.println("\nYou can't add more than 3 units of milk!, Please choose again!");
                isFinishedAdd = false;
            }
        }
    }

    // the static addSugar method takes no parameter with boolean isFinishedAdd,
    // if the user has add more than 3 units of sugar, then print warning message
    private static void addSugar() {

        Scanner input = new Scanner(System.in);
        boolean isFinishedAdd = false;

        while (!isFinishedAdd) {
            System.out.println("\nPlease choose the amount of Sugar that you would like to add between [0 ~ 3 units]!");
            int unitsOfSugar = input.nextInt();
            if (unitsOfSugar >= 0 && unitsOfSugar <= 3) {
                System.out.println("\nYou have add " + unitsOfSugar + " unit of sugar to your drink already!");
                isFinishedAdd = true;
            }
            else {
                System.out.println("\nYou can't add more than 3 units of sugar!, Please choose again!");
                isFinishedAdd = false;
            }
        }
    }
}
