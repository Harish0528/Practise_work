87. WAP to print all perfect numbers between given interval using functions.
import java.util.Scanner;
public class example87 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);

      System.out.print("enter number: ");
      int start=scan.nextInt();
      
      System.out.print("enter number: ");
      int end=scan.nextInt();
      
      
      int temp=0;
       int n=0;
      
      for(int i=start;i<=end;i++){ 
           temp=i;
           n=i;
         int sum=0;
       for(int j=1;j<=n/2;j++){
          if(n%j==0){
              sum=sum+j;
          }
       }
       if(sum==n){
          System.out.println(sum+" ");
       }
      } 
      
	}
}	
