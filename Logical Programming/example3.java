import java.util.Scanner;
public class example3 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    System.out.println("enter number:");
	    int num=scan.nextInt();
	    if(num>0){
	            System.out.println(num+"is a positive");
	    }
	    else if(num<0){
	          System.out.println(num+"is a negative");
	    }
	    else{
	          System.out.println("It is a zero");
	    }
	}
}
