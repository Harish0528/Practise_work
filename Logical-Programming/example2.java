2. Write a java program to find maximum between three numbers.
import java.util.Scanner;
public class MaxNo {
	public static void main(String[] args) {
		int max=0,num=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 3 values");     
		max=s.nextInt();	
		for(int i=2;i<=3;i++) {
			num=s.nextInt();
			if(max<num) {               
				max=num;                  
			}
		}
		System.out.println("Max: "+max);
	}
}