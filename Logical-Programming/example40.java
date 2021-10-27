40. Write a java program to print all Prime numbers between 1 to n.
import java.util.Scanner;
public class example40 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);

      System.out.print("enter number: ");
      int n=scan.nextInt();
      
       for(int i=2;i<n;i++){
           int count=0;
           for(int j=1;j<=i;j++){
               if(i%j==0){
                   count++;
               }
           }
           if(count==2){
               System.out.println(i+" ");
           }
       }
	}
}	
