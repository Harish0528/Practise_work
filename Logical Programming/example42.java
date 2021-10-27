import java.util.Scanner;
public class example42 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);

      System.out.print("enter number: ");
      int n=scan.nextInt();
      int x=0;
      System.out.println("prime factors : ");
      for(int i=2;i<n/2;i++){
          int count=0;
          if(n%i==0){
              x=i;
              for(int j=1;j<x;j++){
                  if(i%j==0){
                      count++;
                  }
              }
          }
          if(count==1){
              System.out.print(x+" ");
          }
      }
	}
}	