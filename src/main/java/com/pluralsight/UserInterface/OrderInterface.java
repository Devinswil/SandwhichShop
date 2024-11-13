package com.pluralsight.UserInterface;


import com.pluralsight.Products.Sandwich;

import java.util.Scanner;


public class OrderInterface {
    private final Scanner scanner = new Scanner(System.in);


    public void display() {
        boolean running = true;
        while (running) {
            System.out.println("****** Welcome to Dev-lious Subs ******");
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
        double sandwichSize = getSizeSandwich();
        String breadType=getBreadSize();
        boolean istoasted=getSandwichToasted();

        Sandwich sandwich=new Sandwich(breadType,sandwichSize,istoasted);
        sandwich.getToasted();
        System.out.println(sandwich);
    }

    public String getBreadSize() {
        while (true) {
            System.out.println("What Bread would you like your sandwich on?");
            System.out.println("1) White");
            System.out.println("2) Wheat");
            System.out.println("3) Rye");
            System.out.println("4) Wrap");
            int answer = scanner.nextInt();
            scanner.nextLine();
            String breadChoice = null;
            switch (answer) {
                case 1:
                   return "White";
                case 2:
                    return "Wheat";
                case 3:
                    return  "Rye";
                case 4:
                    return  "Wrap";
                default:
                    System.out.println("Invalid option");
                    break;
            }

        }
    }


    public double getSizeSandwich() {
        while (true) {
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

        }


    }
    public boolean getSandwichToasted() {
        while (true) {

            System.out.println("Would you like your sandwich toasted?");
            System.out.println("1) Yes");
            System.out.println("2) No");
            int answer = scanner.nextInt();
            scanner.nextLine();

            switch (answer) {
                case 1:
                    return true;
                case 2:
                    return false;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
}
