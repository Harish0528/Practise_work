72. Write a java program to search all occurrences of a character in given string.
import java.util.Scanner;

public class AllOccurances {
	private static Scanner sc;
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.nextLine();
		System.out.print("Enter a Character: ");
		char ch = sc.next().charAt(0);
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) ==  ch) {
				System.out.println("The Character "+ ch + " appears " + i +" index" );
			}
		}
	}
}