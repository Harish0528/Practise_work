17. Write a java program to print all natural numbers from 1 to n. - using while loop
import java.util.Scanner;
public class example17 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    
	    System.out.println("enter a number");
	    int n=scan.nextInt();
	    
	    for(int i=1;i<=n;i++){
	        System.out.print(i+" ");
	    }
	}
}	
