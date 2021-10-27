80. Write a java program to copy contents from one file to another file.
import java.io.*;
import java.util.*;
public class CopyFile {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a string: ");
        // String str = sc.nextLine();
        try {
            FileWriter fw = new FileWriter("xyz.txt");
            FileReader fr = new FileReader("abc.txt");
            int ch = 0;
            while((ch=fr.read())!=-1) {
                fw.write(ch);
            }
            fw.flush();
            System.out.println("Data inserted Successfully");
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}