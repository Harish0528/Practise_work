37. Write a java program to find all factors of a number.
import java.util.Scanner;
public class example37 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);

      System.out.print("enter number: ");
      int n=scan.nextInt();
      
      for(int i=1;i<=n/2;i++){
          if(n%i==0){
              System.out.print(i+" ");
          }
      }
	}
}	
