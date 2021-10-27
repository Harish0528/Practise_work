67. Write a java program to count total number of words in a string.
import java.util.Scanner;
public class CountWords {  
    static int cw(String str) {  
        int count=0;  
        char ch[]= new char[str.length()];     
        for(int i=0;i<str.length();i++) {  
            ch[i]= str.charAt(i);  
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) ) { 
                count++;  
            }
        }
        return count;  
    }  
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();  
        System.out.println(cw(str) + " words.");   
    }  
}  