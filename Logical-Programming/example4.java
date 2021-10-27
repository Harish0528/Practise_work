4. Write a java program to check whether a number is divisible by 5 and 11 or not.
import java.util.Scanner;
public class CheckDivisible {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int num=s.nextInt();		
		if(num%5==0) {
			System.out.println("Given Number is divisiable by 5");
		}
		else if(num%11==0) {
			System.out.println("Given number is divisiable by 11");
		}
		else {
			System.out.println("Given number is not divisiable by 5 and 11");
		}		
	}
}
