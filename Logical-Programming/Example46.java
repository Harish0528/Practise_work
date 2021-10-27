46. Write a java program to print all Perfect numbers between 1 to n.
import java.util.Scanner;
public class PerfectNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        for(int i=1; i<=num; i++) {
            if(perfect(i)) {
                System.out.println(i);
            }
        }
    }
    static boolean perfect(int num) {
        int sum = 0;
        for(int i=1; i<num; i++) {
            if(num%i==0) {
                sum = sum+i;
            }
        }
        if(sum==num) {
            return true;
        }
        else {
            return false;
        }
    }
}