package Practice4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedExceptionHandling {
    public static void main(String[] args) {
        try {
            File file = new File("nonexistentfile.txt");
            Scanner scanner = new Scanner(file); // Trying to read from a nonexistent file
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException caught: " + e);
        }
        System.out.println("Program continues after handling the exception.");
    }
}
