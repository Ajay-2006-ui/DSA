package JavaReview;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling{
    public static void main(String args[]){
        try {
            File file = new File("Student.txt");
            if (file.createNewFile()) {
                System.out.println("File Created Successfully");
            }
            else{
                System.out.println("Already Exists");
            }
            System.out.println(file.getName());
            System.out.println(file.length ());
            System.out.println(file.exists());
            System.out.println(file.getAbsolutePath());


        }
        catch(IOException e){
            System.out.println("Error Occured");
        }
    }

}
