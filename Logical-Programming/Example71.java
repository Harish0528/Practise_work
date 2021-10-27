71. Write a java program to find last occurrence of a character in a given string.
import java.util.Scanner;
class LastOccurance{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
		int i, index = 0;
		for(i = 0; i < str.length(); i++) {
			if(str.charAt(i) ==  ch) {
				index = i;
			}
		}
		if(index == -1) {
			System.out.println("\nSorry! We haven't found the Character ");
		}
		else {
			System.out.println("The Last Occurrence of character"+ ch + " at " + index + " position" );
		}
    }
}