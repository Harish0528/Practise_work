34. Write a java program to enter a number and print it in words
import java.util.Scanner;
public class example34 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);

      System.out.println("enter number:");
      int n=scan.nextInt();
      String str=String.valueOf(n);
      System.out.println("In words: "+(str+str));
	}
}	
