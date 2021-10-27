import java.util.Scanner;
public class example43 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);

      System.out.print("enter number: ");
      int n=scan.nextInt();
      int temp=n;
      int sum=0,count=0,number=1,rem=0;
      int last=temp;
      while(n!=0){
          n=n/10;
          count++;
      }
      for(int i=1;i<=count;i++){
          rem=temp%10;
          temp=temp/10;
        for(int j=1;j<=count;j++){
          number=number*rem;
        }
        sum=sum+number;
        number=1;
      }
      if(sum==last){
          System.out.println("Amstrong number");
      }
      else{
          System.out.println("Not a Amstrong number");
      }
	}
}	