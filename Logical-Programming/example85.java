85. WAP to print all strong numbers between given interval using functions.
import java.util.Scanner;
public class example85 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);

      System.out.print("enter starting number : ");
      int start=scan.nextInt();
      
      System.out.print("enter ending number: ");
      int end=scan.nextInt();
      
      int fact=1;
      
      for(int j=start;j<=end;j++){
          int sum=0,rem=0;
          
         int temp=j;
         int temp1=j;
        while(temp1!=0){
          rem=temp1%10;
          int i=1;
          fact=1;
          while(i<=rem){
              fact=fact*i;
              i++;
          }
          temp1=temp1/10;
          sum=sum+fact;
          
         }
       if(sum==temp){
          System.out.println(j+" ");
       }
     }
      
	}
}	
