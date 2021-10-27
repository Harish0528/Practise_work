5. Write a java program to check whether a number is even or odd.
import java.util.Scanner;
public class EvenOdd {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int num=s.nextInt();
		if(num%2==0) {
			System.out.println("Given Number is even");
		}
		else {
			System.out.println("Given number is odd");
		}
	}
}