import java.util.Scanner;
public class example47 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);

      System.out.print("enter number: ");
      int n=scan.nextInt();
      int fact=1;
      int sum=0,rem=0;
      int temp=n;
      while(n!=0){
          rem=n%10;
          int i=1;
          fact=1;
          while(i<=rem){
              fact=fact*i;
              i++;
          }
          n=n/10;
          sum=sum+fact;
          
      }
      if(sum==temp){
          System.out.println("strong number");
      }
      else{
          System.out.println("not a strong number");
      }
      
	}
}	