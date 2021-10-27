49. Write a java program to print Fibonacci series up to n terms
import java.util.Scanner;
public class FebonacciN{
    public static void main(String args[]) {
        int n=0,n1=1,n2,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter count number: ");
        int count = sc.nextInt();
        System.out.print(n+" "+n1);
        System.out.println("Febonacci numbers are: ");
        for(i=2;i<count;++i) {    
            n2=n+n1;    
            System.out.println(" "+n2);    
            n=n1;
            n1=n2;
        }    
    }
}
