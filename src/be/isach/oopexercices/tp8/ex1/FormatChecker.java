package be.isach.oopexercices.tp8.ex1;/*
 * INFO0062 - Object-Oriented Programming
 * Exercise series 8
 *
 * Code basis for exercise series 8. It uses classes from the Java library to extract the content
 * of a file (which the path is provided in command line) and write it into a String object. Two
 * exceptions from the Java library must be handled: IOException and FileNotFoundException. How
 * they can be dealt with is demonstrated by this program.
 *
 * It is worth noting that FileNotFoundException and IOException are actually related, as the
 * former is a child class of the latter and specifies that the in/out issue is that a file could
 * not be opened because it couldn't be found. You can check this here:
 *
 * https://docs.oracle.com/javase/8/docs/api/java/io/FileNotFoundException.html
 *
 * @author: J.-F. Grailet
 */

import be.isach.oopexercices.tp8.ex2.CreditException;
import be.isach.oopexercices.tp8.ex2.Credits;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FormatChecker {
    /*
     * Static method putting away from the main() the operation of extracting the content of a
     * file and writing it in a String object. For reminders, having a main() method in a class
     * doesn't prevent you from defining other methods and calling them in this main().
     */

    public static String extractContent(String filePath) throws IOException {
        FileReader reader = null;
        try {
            /*
             * FileReader constructor throws FileNotFoundException if file is missing. See here:
             *
             * https://docs.oracle.com/javase/8/docs/api/java/io/FileReader.html#FileReader-java.lang.String-
             */

            reader = new FileReader(filePath);
        } catch (FileNotFoundException e) {
            throw e; // Re-throws
        }

        BufferedReader br = new BufferedReader(reader);
        String content = "";
        try {
            /*
             * readLine() from BufferedReader throws an IOException in case of problem. See here:
             *
             * https://docs.oracle.com/javase/8/docs/api/java/io/BufferedReader.html#readLine--
             */

            String line = br.readLine();
            while (line != null) {
                content += line + "\n";
                line = br.readLine();
            }
        } catch (IOException e) {
            throw e; // Re-throws
        }
        return content;
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java FormatChecker [file path]");
            return;
        }

        String content = "";
        try {
            content = extractContent(args[0]); // Calling the static method from above
        } catch (FileNotFoundException e) {
            System.err.println(args[0] + " could not be found."); // Note the System.err
            return;
        } catch (IOException e) {
            System.err.println(args[0] + " could not be read."); // Ditto
            return;
        }

        /*
         * Prints the extracted content line by line, as a test and as a demo of the split()
         * method from the String class. For reminders, "\n" is the newline character and delimits
         * the end of a line.
         */

        String[] lines = content.split("\n");
        for (String line : lines) {
            System.out.println(line);
        }
        System.out.println("\n\n\n-------------- Credits Test --------------\n\n");

        int sumOfCredits = 0;
        double sumOfWeightedAvg = 0.0;
        for (int i = 0; i < lines.length; i++) {
            String line = lines[i];
            try {
                Credits c = new Credits(line);
                sumOfCredits += c.getCredits();
                sumOfWeightedAvg += c.getWeightedGrade();
            } catch (CreditException e) {
                System.out.println("Problem @ Line " + (i + 1) + ": " + e.getMessage());
            }
        }
        if(sumOfCredits > 0) {
            System.out.println("\nCredits: " + sumOfWeightedAvg + "/" + sumOfCredits);
            System.out.println("Weighted Average: " + (sumOfWeightedAvg / sumOfCredits * 20));
        }
    }
}
