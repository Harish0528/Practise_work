45. Write a java program to check whether a number is Perfect number or not.
import java.util.Scanner;
public class PerfectNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i = 1; i < num; i++) {
            if(num % i == 0) {
                sum = sum + i;
            }
        }
        if(sum == num) {
            System.out.println(num + " is Perfect number");
        }
        else {
            System.out.println(num + " is not Perfect number");
        }    
    }
    int divisor(int x) {
       return x;
    }
}