35. Write a java program to print all ASCII character with their values.
//import java.util.Scanner;
public class example35 {
	public static void main(String[] args) {
	    //Scanner scan=new Scanner(System.in);
	    char ch=' ';
	    for(int i=0;i<255;i++){
	        System.out.println("The ascii value of "+(char)i+" = "+i);
	    }
	}
}  
