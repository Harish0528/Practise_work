84. WAP to find all prime numbers between given interval using functions.
import java.util.Scanner;
public class PrimeNumberInterval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int first = sc.nextInt();
        System.out.println("Enter second number: ");
        int second = sc.nextInt();
        while (first < second) {
            boolean flag = false;
            for(int i = 2; i <= first/2; ++i) {
                // condition for nonprime number
                if(first % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag && first != 0 && first != 1) {
                System.out.print(first + " ");
            }
            ++first;
        }
    }
}