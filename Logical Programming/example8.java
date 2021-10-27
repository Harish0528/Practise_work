import java.util.Scanner;
public class example8 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    
	    System.out.println("enter a character");
	    char ch=scan.next().charAt(0);
	    if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u' 
	    || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
	        System.out.println("It is a vowel");
	    }
	    else{
	     System.out.println("It is a consonant");
	      
	    }
	}
}