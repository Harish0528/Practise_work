12. Write a java program to count total number of notes in given amount.
import java.util.Scanner;
public class example12 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    
	    System.out.println("enter a amount ");
        int num=scan.nextInt();
        int rem=0;
        if(num>=100){
            rem=num%2000;
            num=num/2000;
            System.out.println("number of 2000 notes :  "+num);
            num=rem/500;
            rem=rem%500;
            System.out.println("number of 500 notes :  "+num);
            num=rem/200;
            rem=rem%200;
             System.out.println("number of 200 notes :  "+num);
            num=rem/100;
            System.out.println("number of 100 notes  : "+num);
        }
	}
}
