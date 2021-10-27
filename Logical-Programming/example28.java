28. Write a java program to find sum of first and last digit of a number.
import java.util.Scanner;
public class example28 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);

      System.out.println("enter number:");
       int n=scan.nextInt();
       int first=0,last=0;
        last=n%10;
       
       while(n!=0){
           first=n%10;
           n=n/10;
       }
       System.out.println("sum of first and last digit :"+(first+last));
       
       
       
	}
}	
