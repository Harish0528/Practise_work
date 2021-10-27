import java.util.Scanner;
public class example64 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    System.out.println("enter String:"); 
	    String str1=scan.next();
	    
	    System.out.println("enter another String:"); 
	    String str2=scan.next();
	    
	    System.out.println("length of string is : "+str1.length());
	    
	    System.out.println("comparison of string is : "+(str1.equals(str2)));

        System.out.println("length of string is : "+str1.concat(str2));
	    	    
	}
}	