import java.util.Scanner;
public class example18 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    
	    System.out.println("enter a number");
	    int n=scan.nextInt();
	    int i=n;
	    
	    while(i>=1){
	        System.out.print(i+" ");
	        i--;
	    }
	}
}	