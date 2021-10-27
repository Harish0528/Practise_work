29. Write a java program to check whether a number is palindrome or not.
import java.util.Scanner;
public class example29 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);

      System.out.println("enter number:");
      int n=scan.nextInt();
      int rem=0,num=0,temp=0;
      temp=n;
      while(n!=0){
          rem=n%10;
          num=num*10+rem;
          n=n/10;
          
      }
      if(num==temp){
          System.out.println("palindrome");
      }
      else{
          System.out.println("not palindrome");
      }
	}
	
}	
