package myio;

import java.io.File;

/**
 *
 * @author Shah
 */
public class RenameFileExample {

    public static void main(String[] args) {

        File oldFile = new File("F:\\io\\test.txt");   // existing file
        File newFile = new File("F:\\io\\renamed.txt"); // new name

        if (oldFile.exists()) {
            if (oldFile.renameTo(newFile)) {
                System.out.println("File renamed successfully");
            } else {
                System.out.println("Failed to rename file");
            }
        } else {
            System.out.println("File does not exist");
        }
    }
}