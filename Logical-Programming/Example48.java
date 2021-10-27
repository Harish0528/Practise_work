48. Write a java program to print all Strong numbers between 1 to n.
import java.util.Scanner;
public class AllStrong {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter frist number: ");
        int num = sc.nextInt();
        System.out.println("Enter second number:");
        int num1 = sc.nextInt();
        int n1,n2,fact,rem;
        System.out.println("Strong numbers between " + num + " and " + num1 + " are:");
        for(int i=num;i<=num1;i++) {
            n1=i;
            n2=i;
            int sum=0;
            fact=1;
            while(n1!=0) {   
                fact=1;
                rem=n1%10;
                n1=n1/10;
                for(int j=1;j<=rem;j++) {
                    fact=fact*j;
                    sum=sum+fact;
                }
            }
            if(sum==n2) {
                System.out.println(i+" ");
            }
        }
    }
}