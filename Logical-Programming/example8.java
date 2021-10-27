8. Write a java program to input any alphabet and check whether it is vowel or  consonant.
import java.util.Scanner;
public class VowCons {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a Character");
		char ch=s.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
			System.out.println("Given character is vowel");
		}
		else {
			System.out.println("Given year is not a consonent");
		}
	}
}