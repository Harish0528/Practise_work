31. Write a java program to calculate product of digits of a number.
import java.util.Scanner;
public class example31 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);

      System.out.println("enter number:");
       int n=scan.nextInt();
       int sum=1,first=0;
       while(n!=0){
           first=n%10;
           n=n/10;
           sum=sum*first;
       }
      System.out.println("Sum of digits:"+sum);
       
	}
}	
