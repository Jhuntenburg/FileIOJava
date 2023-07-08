package Step4;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFour
{
    /**
     * Yes, you can look at the other 
     * examples in this lab to build your solution here.
     */
        public static void main(String[] args) {
            try {
                // File paths for the files to read
                String[] filePaths = {
                        "/Users/joe/Desktop/local projects/FileIOJava/Step1/input.txt",
                        "/Users/joe/Desktop/local projects/FileIOJava/Step2/input.txt",
                        "/Users/joe/Desktop/local projects/FileIOJava/output.txt"
                };

                // Loop through the file paths
                for (String filePath : filePaths) {
                    // Create the Scanner object using the file as input
                    Scanner fileIn = new Scanner(new File(filePath));

                    // Loop while the file still has lines
                    while (fileIn.hasNextLine()) {
                        // Read the entire line
                        String lineIn = fileIn.nextLine();
                        // Output the line
                        System.out.println(lineIn);
                    }

                    // Close the Scanner for the current file
                    fileIn.close();
                }
            } catch (IOException e) {
                System.out.println("File not found");
            }
        }}