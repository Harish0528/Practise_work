import java.util.Scanner;
public class example24 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);

      System.out.println("enter number:");
       int n=scan.nextInt();
	    int i=1;
	    int sum=0;
	    
	    while(i<=n){
	       if(i%2!=0){ 
	        sum=sum+i;
	        
	       }
	       i++;
	    }
	    System.out.print("Sum of odd numbers is: "+sum);
	}
}	