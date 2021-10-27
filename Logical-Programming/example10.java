10. Write a java program to check whether a character is uppercase or lowercase alphabet.
import java.util.Scanner;
public class CaseUL {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a Character");
		char ch=s.next().charAt(0);
		if(ch>='A'&&ch<='Z') {
			System.out.println("Given character is Upeercase");
		}
		else if(ch>='a'&&ch<='z') {
			System.out.println("Given character is LowerCase");
		}
		else {
			System.out.println("Enter a Alphabet");
		}
	}
}