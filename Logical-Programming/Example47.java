47. Write a java program to check whether a number is Strong number or not.
import java.util.*;
public class Strong{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int s = sc.nextInt();
        int i;
        int fact,lastdig;
        int total = 0;
        int temp = s;
        while(s != 0) {
            i = 1;
            fact = 1;
            lastdig = s % 10;
            while(i <= lastdig) {
                fact = fact * i;
                i++;
            }
            total = total + fact;
            s = s / 10;
        }
        if(total == temp) {
            System.out.println(temp + " is a strong number\n");
        }
        else {
            System.out.println(temp + " is not a strong number\n");
        }
        System.out.println();
    }
}