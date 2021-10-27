43. Write a java program to check whether a number is Armstrong number or not.
import java.util.Scanner;
public class AmstrongNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int num1, rem, result = 0;
        num1 = num;
        while (num1 != 0) {
            rem = num1 % 10;
            result += Math.pow(rem, 3);
            num1 /= 10;
        }
        if(result == num) {
            System.out.println(num + " is an Armstrong number.");
        }
        else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}