73. Write a java program to count occurrences of a character in given string.
import java.util.Scanner;
class CountFrequency{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.next();
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        int count=0;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("The Character "+ ch + " appears " + count +" times");
    }
}