package com.pluralsight.ReceiptFileManager;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BufferedWriter {

    public void saveReceipt() {
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
        for (int i = 0; i < 100; i++) {
            String fileName1 = "Receipt"+time+ ".txt";
            try {
                BufferedWriter br = new BufferedWriter(new FileWriter(fileName1)){}
            } catch (IOException e) {
                System.err.println("Error writing to file: " + e.getMessage());
            }

        }

    }


}
