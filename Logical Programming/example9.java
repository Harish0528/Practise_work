import java.util.Scanner;
public class example9 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    
	    System.out.println("enter a character");
	    char ch=scan.next().charAt(0);
	    if((ch>='A'&& ch<='Z') || (ch>='a' && ch<='z')){
	        System.out.println("It is a alphabet");
	    }
	    else if(ch>='0'&& ch<='9'){
	         System.out.println("It is a digit");
	    }
	    else{
	         System.out.println("It is a special");
	    }
	}
	
}