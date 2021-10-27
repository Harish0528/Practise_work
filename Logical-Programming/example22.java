22. Write a java program to find sum of all natural numbers between 1 to n.
import java.util.Scanner;
public class example22 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    
	    System.out.println("enter a number");
	    int n=scan.nextInt();
	    int sum=0;
	    for(int i=1;i<=n;i++){
	        sum=sum+i;
	       
	    }
	    System.out.print("Sum of natural numbers is :"+sum);
	}
}	
