75. Write a java program to find lowest frequency character in a string.
import java.util.Scanner;
class LowestFrequency {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.next();
        int[] freq = new int[str.length()];    
        char minChar = str.charAt(0);   
        int i, j, low;   
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
        low = freq[0];    
        for(i = 0; i <freq.length; i++) { 
            if(low > freq[i] && freq[i] != '0') {    
                low = freq[i];    
                minChar = ch[i];    
            }    
        }   
        System.out.println("Minimum occurring character: " + minChar);    
    }    
}
