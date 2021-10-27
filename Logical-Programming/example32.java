32. Write a java program to enter a number and print its reverse.
import java.util.Scanner;
public class example32 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);

      System.out.println("enter number:");
      int n=scan.nextInt();
      int rem=0,num=0;
      
      while(n!=0){
          rem=n%10;
          num=num*10+rem;
          n=n/10;
          
      }
      System.out.println("reverse number is:"+num);
	}
}	
