import java.util.Scanner;
public class example2 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    System.out.println("enter three numbers:");
	    int num1=scan.nextInt();
	    int num2=scan.nextInt();
	    int num3=scan.nextInt();
	    if(num1>num2 && num1>num3){
	        System.out.println(num1+"is a highest number");
	    }
	    else if(num2>num3){
	        System.out.println(num2+"is a highest numer");
	    }
	    else{
	         System.out.println(num3+"is a highest numer");
	    }
}
}