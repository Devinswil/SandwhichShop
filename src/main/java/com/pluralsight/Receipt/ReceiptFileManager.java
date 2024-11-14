package com.pluralsight.Receipt;

import com.pluralsight.AbstractClasses.Merchandise;
import com.pluralsight.Products.Sandwich;
import com.pluralsight.UserInterface.Cart;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptFileManager {

    public void saveReceipt(Cart cart, Merchandise merchandise) {
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        String fileName = "Receipt" + time + ".txt";
        try (BufferedWriter br = new BufferedWriter(new FileWriter(fileName, true))) {
            br.write("********Dev-lious Subs********\n");
            br.newLine();
            System.out.println("1(800)Dev-lious\n");
            System.out.println("Manager Devin\n");
            br.write((Sandwich)merchandise);


        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
    }

}


