package myio;

import java.io.File;

/**
 *
 * @author Shah
 */
public class DeleteFileExample {

    public static void main(String[] args) {

        File file = new File("F:\\io\\renamed.txt"); // file to delete

        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File deleted successfully");
            } else {
                System.out.println("Failed to delete file");
            }
        } else {
            System.out.println("File does not exist");
        }
    }
}