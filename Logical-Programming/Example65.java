65. Write a java program to find total number of alphabets, digits or special character in a string.
import java.util.Scanner;
public class NoDAS{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
		int i, alph, digi, spl;
		alph = digi = spl = 0;
		char ch;
		for(i = 0; i <str.length(); i++) {
			ch = str.charAt(i);
			if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' ) {
				alph++;
			}
			else if(ch >= '0' && ch <= '9') {
				digi++;
			}
			else {
				spl++;
			}
		}		
		System.out.println("\nNumber of Alphabet Characters: " + alph);
		System.out.println("Number of Digit Characters: " + digi);
		System.out.println("Number of Special Characters: " + spl);
    }
}