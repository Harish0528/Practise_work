81. Write a java program to merge two file to third file.
import java.io.*;
import java.util.*;
public class CopyFile {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a string: ");
        // String str = sc.nextLine();
        try {
            FileReader fr = new FileReader("abc.txt");
            FileReader fr1 = new FileReader("xyz.txt");
            FileWriter fw = new FileWriter("def.txt");
            int ch = 0;
            while((ch=fr.read())!=-1) {
                fw.write(ch);
            }
            fw.flush();
            while((ch=fr1.read())!=-1) {
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