39. Write a java program to check whether a number is Prime number or not.
import java.util.Scanner;
public class example39 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);

      System.out.print("enter number: ");
      int n=scan.nextInt();
      int count=0;
        while(n!=0 && n!=1){
          for(int j=2;j<=n/2;j++){
              if(n%j==0){
                  count++;
              }
              
          }
           if(count>=1){
                  System.out.println("not prime");
              }
              else{
                 System.out.println(" prime"); 
              } 
              break;
        }
      
	}
}	
