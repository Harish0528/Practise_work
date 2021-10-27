import java.util.Scanner;
public class example25 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);

      System.out.println("enter table number:");
       int n=scan.nextInt();
       
       for(int i=1;i<=10;i++){
           System.out.println(n+" * "+i+" = "+(n*i));
       }
	}
}	