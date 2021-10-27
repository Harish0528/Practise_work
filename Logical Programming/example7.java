import java.util.Scanner;
public class example7 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    System.out.println("enter a character:");
	    char ch=scan.next().charAt(0);
	    if((ch>='A'&& ch<='Z') || (ch>='a' && ch<='z')){
	        System.out.println("alphabet");
	    }
	    else{
	        System.out.println("not a alphabet");
	    }
	    
	}
	
}
