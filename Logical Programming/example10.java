//10. Write a java program to check whether a character is uppercase or lowercase alphabet.
import java.util.Scanner;
public class example10 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    
	    System.out.println("enter a character");
	    char ch=scan.next().charAt(0);
	    if(ch>='A'&& ch<='Z'){
	        System.out.println("uppercase");
	    }
	    else if(ch>='a' && ch<='z'){
	        System.out.println("lowercase");
	    }
	    
}
}
