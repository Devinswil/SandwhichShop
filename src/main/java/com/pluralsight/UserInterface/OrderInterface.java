package com.pluralsight.UserInterface;


import com.pluralsight.Products.Chips;
import com.pluralsight.Products.Drink;
import com.pluralsight.Products.Sandwich;
import com.pluralsight.Receipt.ReceiptFileManager;
import com.pluralsight.Toppings.Cheese;
import com.pluralsight.Toppings.Meat;
import com.pluralsight.Toppings.RegularTopping;
import com.pluralsight.Toppings.Sauce;


import java.util.Scanner;


public class OrderInterface {
    private static final Scanner scanner = new Scanner(System.in);
    Cart foodCart = new Cart();
    private boolean checkOrder = false;

    public void display() {
        boolean running = true;
        while (running) {
            System.out.println("****** Welcome to Dev-lious Subs ******");
            System.out.println("please select a number for corresponding selection");
            System.out.println("Would you like to place an order?");
            System.out.println("1-Yes");
            System.out.println("2-No");
            int answer = scanner.nextInt();

            switch (answer) {
                case 1 -> menu();
                case 2 -> running = false;
                default -> System.out.println("Invalid option");
            }
            if (checkOrder) {
                running = false;
            }
        }
    }

    public void menu() {
        boolean running = true;
        while (running) {
            System.out.println("1- Order Sandwich");
            System.out.println("2- Add Chips");
            System.out.println("3- Add Drink");
            System.out.println("4- Display Order");
            System.out.println("5- Cancel order");
            int answer = scanner.nextInt();
            scanner.nextLine();

            switch (answer) {
                case 1 -> beginSandwichOrder();
                case 2 -> orderChip();
                case 3 -> orderDrink();
                case 4 -> displayOrder();
                case 5 -> {
                    foodCart.clearCart();
                    running = false;
                }
                default -> System.out.println("Invalid option");
            }
            if (checkOrder) {
                running = false;
            }
        }
    }

    public void displayOrder() {
        foodCart.displayCart();
        if (!foodCart.isEmpty()) {
            System.out.println("Would you like to check out? Yes/No");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("yes")) {
                ReceiptFileManager receiptFileManager = new ReceiptFileManager();
                receiptFileManager.saveReceipt(foodCart);
                foodCart.checkOut();
                checkOrder = true;
            } else {
                System.out.println("okay");
            }
        }
    }

    public void beginSandwichOrder() {

        int sandwichSize = getSizeSandwich();
        String breadType = getBreadType();
        boolean istoasted = getSandwichToasted();

        Sandwich sandwich = new Sandwich(breadType, sandwichSize, istoasted);
        if (istoasted) {
            sandwich.getToasted();
        }
        buildSandwich(sandwich);
        foodCart.addItem(sandwich);

    }

    public String getBreadType() {
        while (true) {
            System.out.println("What Bread would you like your sandwich on?");
            System.out.println("1) White");
            System.out.println("2) Wheat");
            System.out.println("3) Rye");
            System.out.println("4) SourDough");
            int answer = scanner.nextInt();
            scanner.nextLine();
            String breadChoice = null;
            switch (answer) {
                case 1 -> {
                    return "White";
                }
                case 2 -> {
                    return "Wheat";
                }
                case 3 -> {
                    return "Rye";
                }
                case 4 -> {
                    return "Wrap";
                }
                default -> System.out.println("Invalid option");
            }

        }
    }

    public int getSizeSandwich() {
        while (true) {
            System.out.println("What size sandwich would you like to order?");
            System.out.println("1- 4'");
            System.out.println("2- 8'");
            System.out.println("3- 12'");

            int answer = scanner.nextInt();
            scanner.nextLine();

            switch (answer) {
                case 1 -> {
                    return 4;
                }
                case 2 -> {
                    return 8;
                }
                case 3 -> {
                    return 12;
                }
                default -> System.out.println("Invalid option");
            }

        }


    }

    public boolean getSandwichToasted() {
        while (true) {

            System.out.println("Would you like your sandwich toasted?");
            System.out.println("1- Yes");
            System.out.println("2- No");
            int answer = scanner.nextInt();
            scanner.nextLine();

            switch (answer) {
                case 1 -> {
                    return true;
                }
                case 2 -> {
                    return false;
                }
                default -> System.out.println("Invalid option");
            }
        }

    }

    public void getCheese(Sandwich sandwich) {
        System.out.println("What cheese would you like to add to your sandwich");
        System.out.println("Cost of Premium toppings will vary on the size of bread!");
        boolean running = true;
        while (running) {
            System.out.println("1- American");
            System.out.println("2- Provolone");
            System.out.println("3- Cheddar");
            System.out.println("4- Swiss");
            System.out.println("5- That's it(done with cheese)");
            int answer = scanner.nextInt();
            scanner.nextLine();
            String cheese = null;
            switch (answer) {
                case 1 -> cheese = "American";
                case 2 -> cheese = "Provolone";
                case 3 -> cheese = "Cheddar";
                case 4 -> cheese = "Swiss";
                case 5 -> {
                    running = false;
                    continue;
                }
                default -> System.out.println("Invalid option");
            }
            if (cheese != null) {
                sandwich.addTopping(new Cheese(cheese));
                System.out.println(cheese + " cheese has been added to sandwich.");

            }
        }
    }

    public void getMeat(Sandwich sandwich) {
        System.out.println("What Meat would you like to add to your sandwich");
        boolean running = true;
        while (running) {
            System.out.println("1- Steak");
            System.out.println("2- Ham");
            System.out.println("3- Salami");
            System.out.println("4- Roast Beef");
            System.out.println("5- Chicken");
            System.out.println("6- Bacon");
            System.out.println("7- That's it(done with meat)");
            int answer = scanner.nextInt();
            scanner.nextLine();
            String meat = null;
            switch (answer) {
                case 1 -> meat = "Steak";
                case 2 -> meat = "Ham";
                case 3 -> meat = "Salami";
                case 4 -> meat = "Roast Beef";
                case 5 -> meat = "Chicken";
                case 6 -> meat = "Bacon";
                case 7 -> {
                    running = false;
                    continue;
                }
                default -> System.out.println("Invalid option");
            }
            if (meat != null) {
                sandwich.addTopping(new Meat(meat));
                System.out.println(meat + " meat has been added to sandwich.");

            }
        }
    }

    public void getRegToppings(Sandwich sandwich) {
        System.out.println("What toppings would you like to add to your sandwich");
        boolean running = true;
        while (running) {
            System.out.println("1- Lettuce");
            System.out.println("2- Peppers");
            System.out.println("3- Onions");
            System.out.println("4- Tomatoes");
            System.out.println("5- Jalapenos");
            System.out.println("6- Cucumbers");
            System.out.println("7- Pickles");
            System.out.println("8- Guacamole");
            System.out.println("9- Mushrooms");
            System.out.println("0- That's it(done with toppings)");
            int answer = scanner.nextInt();
            scanner.nextLine();
            String topping = null;
            switch (answer) {
                case 1 -> topping = "Lettuce";
                case 2 -> topping = "Peppers";
                case 3 -> topping = "Onions";
                case 4 -> topping = "Tomatoes";
                case 5 -> topping = "Jalapenos";
                case 6 -> topping = "Cucumbers";
                case 7 -> topping = "Pickles";
                case 8 -> topping = "Guacamole";
                case 9 -> topping = "Mushrooms";
                case 0 -> {
                    running = false;
                    continue;
                }
                default -> System.out.println("Invalid option");
            }
            if (topping != null) {
                sandwich.addTopping(new RegularTopping(topping));
                System.out.println(topping + " topping has been added to sandwich.");
            }
        }
    }

    public void getSauce(Sandwich sandwich) {
        System.out.println("What sauce would you like to add to your sandwich");
        boolean running = true;
        while (running) {
            System.out.println("1- Mayo");
            System.out.println("2- Mustard");
            System.out.println("3- Ketchup");
            System.out.println("4- Ranch");
            System.out.println("5- Thousand island");
            System.out.println("6- Vinaigrette");
            System.out.println("7- That's it(done with sauce)");
            int answer = scanner.nextInt();
            scanner.nextLine();
            String sauce = null;
            switch (answer) {
                case 1 -> sauce = "Mayo";
                case 2 -> sauce = "Mustard";
                case 3 -> sauce = "Ketchup";
                case 4 -> sauce = "Ranch";
                case 5 -> sauce = "Thousand island";
                case 6 -> sauce = "Vinaigrette";
                case 7 -> {
                    running = false;
                    continue;
                }
                default -> System.out.println("Invalid option");

            }
            if (sauce != null) {
                sandwich.addTopping(new Sauce(sauce));
                System.out.println(sauce + " sauce has been added to sandwich.");

            }
        }
    }
    public void buildSandwich(Sandwich sandwich) {
        getCheese(sandwich);
        getMeat(sandwich);
        getRegToppings(sandwich);
        getSauce(sandwich);
        System.out.println("Sandwich is now complete!");
    }//takes all toppings and apply them into sandwich

    public Chips getChip() {
        while (true) {
            System.out.println("What Chip would you like?");
            System.out.println("1- BBQ");
            System.out.println("2- Original");
            System.out.println("3- Sour Cream & Onion");
            System.out.println("4- Sweet Maui Onion");
            int chipChoice = scanner.nextInt();
            scanner.nextLine();
            String chipFlavor = null;
            switch (chipChoice) {
                case 1 -> chipFlavor = "BBQ";
                case 2 -> chipFlavor = "Original";
                case 3 -> chipFlavor = "Sour Cream & Onion";
                case 4 -> chipFlavor = "Sweet Maui Onion";
                default -> {
                    System.out.println("invalid option");
                    continue;
                }
            }
            System.out.println(chipFlavor + " chips have been added to your order.");
            return new Chips(chipFlavor);

        }
    }//ask for inputs

    public void orderChip() {
        Chips chips = getChip();
        if (chips != null) {
            foodCart.addItem(chips);
        }

    }//saves input into chip

    public Drink getDrink() {
        while (true) {
            System.out.println("Choose a drink:");
            System.out.println("1- Cola");
            System.out.println("2- Lemonade");
            System.out.println("3- Iced Tea");
            System.out.println("4- Water");
            int drinkChoice = scanner.nextInt();
            scanner.nextLine();
            String drinkFlavor = null;

            switch (drinkChoice) {
                case 1 -> drinkFlavor = "Cola";
                case 2 -> drinkFlavor = "Lemonade";
                case 3 -> drinkFlavor = "Iced Tea";
                case 4 -> drinkFlavor = "Water";
                default -> {
                    System.out.println("Invalid option");
                    continue;
                }
            }
            System.out.println("What size would you like your " + drinkFlavor + "?");
            System.out.println("1- Small");
            System.out.println("2- Medium");
            System.out.println("3- Large");
            int sizeChoice = scanner.nextInt();
            scanner.nextLine();
            String drinkSize = null;
            switch (sizeChoice) {
                case 1 -> drinkSize = "Small";
                case 2 -> drinkSize = "Medium";
                case 3 -> drinkSize = "Large";
                default -> {
                    System.out.println("Invalid option. Please select a valid size.");
                    continue;
                }
            }
            System.out.println(drinkSize + " " + drinkFlavor + " has been added to your order.");
            return new Drink(drinkFlavor, drinkSize);

        }
    }//ask for inputs

    public void orderDrink() {
        Drink drink = getDrink();
        if (drink != null) {
            foodCart.addItem(drink);
        }
    }//saves input into drink


}




