import java.util.Scanner;
public class example49 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);

      System.out.print("enter number: ");
      int n=scan.nextInt();
      int num1=0;
      int num2=1;
      int num3=0;
      System.out.print(num1+" "+num2);
      int i=2;
      while(i<n){
         num3=num1+num2;
         System.out.print(" "+num3);
         num1=num2;
         num2=num3;
         i++;
      }
	}
}	