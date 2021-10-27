78. Write a java program to read file contents and display on console.
import java.io.*;
import java.util.*;
public class CopyFile {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a string: ");
        // String str = sc.nextLine();
        try {
            FileReader fr = new FileReader("abc.txt");
            int ch = 0;
            while((ch=fr.read())!=-1) {
                System.out.println((char)ch);
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}