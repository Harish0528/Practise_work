69. Write a java program to check whether a string is palindrome or not.
import java.util.Scanner;
class Palindrome {
    public static void main(String args[]) {
        String reverse= "";
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string:" );
        String str = sc.nextLine();
        int length = str.length();   
        for ( int i = length - 1; i >= 0; i-- ) {
            reverse = reverse + str.charAt(i);  
        }
        if (str.equals(reverse)) {
            System.out.println("Palindrome.");  
        }
        else {  
            System.out.println("Not a Palindrome.");   
        }
    }
}