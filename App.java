package com.example;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) {
        String filePath = "output.txt";
        String content = "Hello, Jenkins! This is a simple Java Maven app.";

        // Write to the file
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(content);
            System.out.println("File written successfully: " + filePath);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        // Read from the file
        try {
            String fileContent = new String(Files.readAllBytes(Paths.get(filePath)));
            System.out.println("File content: " + fileContent);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
