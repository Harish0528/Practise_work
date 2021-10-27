26. Write a java program to count number of digits in a number.
import java.util.Scanner;
public class example26 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);

      System.out.println("enter number:");
       String n=scan.next();
       
       int count=0;
       for(int i=0;i<n.length();i++){
           count++;
       }
       System.out.println("number of :"+count);
	}
}	
     
