1. Write a java program to find maximum between two numbers.
import java.util.Scanner;
public class Max {
	public static void main(String[] args) {
		int max=0,num=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 2 values");     
		max=s.nextInt();	
		num=s.nextInt();
		if(max<num) {               
			max=num;                  
		}
		System.out.println("Max: "+max);
	}
}