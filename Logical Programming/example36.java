import java.util.Scanner;
public class example36 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);

      System.out.println("enter number:");
      int n=scan.nextInt();
      System.out.println("enter power:");
      int p=scan.nextInt();
      int q=n;
      while(n>1){
          for(int i=1;i<p;i++){
              q=q*n;
          }
          break;
      }
      System.out.println("total :"+q);
	}
}	