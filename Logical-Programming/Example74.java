74. Write a C program to find highest frequency character in a string.
import java.util.Scanner;
class HighestFrequency {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.next();
        int[] freq = new int[str.length()];    
        char maxChar = str.charAt(0);   
        int i, j, high;   
        char ch[] = str.toCharArray();    
        for(i = 0; i < ch.length; i++) {    
            freq[i] = 1;    
            for(j = i+1; j < ch.length; j++) {    
                if(ch[i] == ch[j] && ch[i] != ' ' && ch[i] != '0') {    
                    freq[i]++;
                    ch[j] = '0';    
                }    
            }    
        }   
        high = freq[0];    
        for(i = 0; i <freq.length; i++) { 
            if(high < freq[i]) {    
                high = freq[i];    
                maxChar = ch[i];    
            }  
        }   
        System.out.println("Minimum occurring character: " + maxChar);    
    }    
}