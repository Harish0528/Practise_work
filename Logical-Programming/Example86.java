86.//WAP to print all Armstrong numbers between given interval using functions.
import java.util.Scanner;
class Amstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int f = sc.nextInt();
        System.out.println("Enter second number: ");
        int s = sc.nextInt();
        for(int i = f + 1; i < s; ++i) {

            if (checkArmstrong(i))
                System.out.println(i + " ");
        }
    }
    public static boolean checkArmstrong(int num) {
        int digits = 0;
        int result = 0;
        int originalNo = num;
        while (originalNo != 0) {
            originalNo /= 10;
            ++digits;
        }
        originalNo = num;
        while (originalNo != 0) {
            int r = originalNo % 10;
            result += Math.pow(r, digits);
            originalNo /= 10;
        }
        if (result == num) {
            return true;
        }
        return false;
    }
}