package com.pluralsight.UserInterface;

import com.pluralsight.Products.Drink;
import com.pluralsight.Products.Sandwich;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class OrderInterface {
    private final Scanner scanner = new Scanner(System.in);


    public void display() {
        boolean running = true;
        while (running) {
            System.out.println("******Welcome to Dev-lious Subs******");
            System.out.println("Would you like to place and order?");
            System.out.println("1)Yes");
            System.out.println("2)No");
            String answer = scanner.nextLine();

            switch (answer.toLowerCase()) {
                case "yes":
                    takeOrder();
                    break;
                case "no":
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option");
                    break;

            }
        }
    }

    public void takeOrder() {
     double sandwichSize=getSizeSandwich();


        Sandwich sandwich = new Sandwich(getSizeSandwich(),


    }
    public double getSizeSandwich(){
        System.out.println("What size sandwich would you like to order?");
        System.out.println("1) 4'");
        System.out.println("2) 8'");
        System.out.println("3) 12'");
        int answer = scanner.nextInt();
        scanner.nextLine();

        switch (answer) {
            case 1:
                return 4;
            case 2:
             return 8;
            case 3:
                return 12;
            default:
                System.out.println("Invalid option");
                break;
    }

    public void processSizeDrink( Scanner) {
        System.out.println("What drink would you like?");
        String drinkFlavor = scanner.nextLine();
        System.out.println("what size drink would you like ");

        String drinksize = scanner.nextLine();
        Drink drink = new Drink(drinkFlavor, drinksize);
        System.out.println(drink);
    }
}
