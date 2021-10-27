9. Write a java program to input any character and check whether it is alphabet, digit    or special character.
import java.util.Scanner;
public class CheckADSJ {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a Character");
		char ch=s.next().charAt(0);
		if((ch>='A'&&ch<'Z')||(ch>='a'&&ch<'z')) {
			System.out.println("Given character is vowel");
		}
		else if(ch>='0'&&ch<'9') {
			System.out.println("Given character is number");
		}
		else {
			System.out.println("Special Character");
		}
	}
}