76. Write a java program to count frequency of each character in a string.
import java.util.Scanner;
public class Frequency {  
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.next();
        int freq[] = new int[str.length()];
        char ch[] = str.toCharArray();
        for( int i=0; i<str.length(); i++) {
            freq[i] =1;
            for(int j= i+1;j<str.length();j++) {
                if(ch[i] == ch[j]) {
                    freq[i]++;
                    ch[j] = '0';
                }
            }
        }
        System.out.println("Count frequency of each character is: ");
        for (int i=0;i<freq.length;i++) {
            if(ch[i] != ' ' && ch[i] != '0') {
                System.out.println(ch[i] + "-" +freq[i]);
            }
        }
        
    }
}  