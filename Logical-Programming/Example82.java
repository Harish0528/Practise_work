82. Write a java program to count characters, words and lines in a text file.
import java.io.*;
import java.util.*;
public class CopyFile {
    public static void main(String args[]) {
        int cc = 0;
        int wc = 0;
        int lc = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
            String cl = br.readLine();
            while (cl != null) {
                lc++;
                String str[] = cl.split(" ");
                wc = wc + str.length;
                for (String word : str) {
                    cc = cc + word.length();
                }
                 cl = br.readLine();
            }
             System.out.println("Number of character in file : " + cc);
             System.out.println("Number of words in a file : " + wc);
             System.out.println("Number of lines in file : " + lc   );
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}\