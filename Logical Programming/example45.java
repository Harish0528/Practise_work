import java.util.Scanner;
public class example45 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);

      System.out.print("enter number: ");
      int n=scan.nextInt();
      int sum=0;
      int temp=n;
      for(int i=1;i<=n/2;i++){
          if(n%i==0){
              sum=sum+i;
          }
      }
      if(sum==n){
          System.out.println(" perfect number ");
      }
      else{
           System.out.println("not a perfect number ");
      }
	}
}	