44. Write a java program to print all Armstrong numbers between 1 to n.
import java.util.Scanner;
public class AmstrongNo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        int sum, i, rem, temp, count=0;
    	for(i=num+1; i<num2; i++) {
    	    temp = i;
    	    sum = 0;
    	    while(temp != 0) {
        		rem = temp%10;
        		sum = sum + rem*rem*rem;
        		temp = temp/10;
    	   }
    	   if(i == sum) {
    	       if(count == 0) {
    		    System.out.print("Armstrong Numbers Between " + num + " and "+ num2 +": ");
    		}
    		   System.out.print(i + "  ");
    		   count++;
    	   }
    	}
    	if(count == 0) {
    	       System.out.print("There is no Armstrong number Between " + num + " and " + num2);
    	}
    }
}