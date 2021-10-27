27. Write a java program to find first and last digit of a number.
import java.util.Scanner;
public class example27 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);

      System.out.println("enter number:");
       int n=scan.nextInt();
       
       int first=0,last=0;
        last=n%10;
       System.out.println("last digit :"+last);
       while(n!=0){
           first=n%10;
           n=n/10;
       }
       System.out.println("first digit :"+first);
       
       
       
	}
}	
