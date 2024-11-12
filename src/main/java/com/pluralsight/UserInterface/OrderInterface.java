package com.pluralsight.UserInterface;

import com.pluralsight.Products.Drink;

import java.util.Scanner;

public class OrderInterface {
    Scanner scanner = new Scanner(System.in);

    public void processSizeDrink(Scanner scanner){
        System.out.println("What drink would you like?");
        String drinkFlavor= scanner.nextLine();
        System.out.println("what size drink would you like ");

        String drinksize=scanner.nextLine();
        Drink drink = new Drink(drinkFlavor,drinksize);
        System.out.println(drink);
    }
}
