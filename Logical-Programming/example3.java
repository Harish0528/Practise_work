3. Write a java program to check whether a number is negative, positive or zero.
import java.util.Scanner;
public class CheckNPZ {	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int num=s.nextInt();			
		if(num==0) {
			System.out.println("Given Number is Zero");
		}
		else if(num<0) {
			System.out.println("Given number is Negtive");
		}
		else if(num>0) {
			System.out.println("Given number is Postive");
		}		
	}
}