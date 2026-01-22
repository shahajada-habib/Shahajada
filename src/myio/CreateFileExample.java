package myio;  // name of package

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Shah
 */
public class CreateFileExample {

    public static void main(String[] args) {

        try {
            File file = new File("F:\\io\\test.txt"); // specify a file name
            if (file.createNewFile()) {
                System.out.println("File is created");
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}