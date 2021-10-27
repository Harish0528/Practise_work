38. Write a java program to calculate factorial of a number.
import java.util.Scanner;
public class example38 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);

      System.out.print("enter number: ");
      int n=scan.nextInt();
      int fact=1;
      int f=n;
      while(n>1){
          fact=fact*n;
          n--;
      }
      System.out.print("factorial of  "+f+"! number: "+fact);
	}
}	
