import java.util.Scanner;
public class example48 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);

      System.out.print("enter number: ");
      int n=scan.nextInt();
      int fact=1;
      
      for(int j=1;j<=n;j++){
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