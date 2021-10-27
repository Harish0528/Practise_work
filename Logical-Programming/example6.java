6. Write a java program to check whether a year is leap year or not.
import java.util.Scanner;
public class Leap {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);		
		System.out.println("enter a year");
     		int ch=s.nextInt();	
		if((ch%4==0) && (ch%100!=0)||(ch%400==0)) {
			System.out.println("Given year is leap year");
		}
		else {
			System.out.println("Given year is not a leap year");
		}
	}
}