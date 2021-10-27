import java.util.Scanner;
public class example1 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    System.out.println("enter two numbers:");
	    int num1=scan.nextInt();
	    int num2=scan.nextInt();
	    
	    if(num1>num2){
	        System.out.println(num1+"is a max number");
	    }
	    else{
	        System.out.println(num2+"is a max number");
	    }
	}
	
}
