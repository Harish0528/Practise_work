7. Write a java program to check whether a character is alphabet or not.
import java.util.Scanner;
public class Character {	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a Character");
		char ch=s.next().charAt(0);
		if((ch>='A'&&ch<'Z')||(ch>='a'&&ch<'z')) {
			System.out.println("Given character is alphabet");
		}
		else {
			System.out.println("Given character is not a alphabet");
		}
	}
}