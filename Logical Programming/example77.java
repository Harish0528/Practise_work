import java.util.Scanner;
import java.io.*;
public class example77 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    
	    System.out.print("enter String : ");
	    String str=scan.nextLine();
	    
	    try{
	        FileOutputStream fis=new FileOutputStream("abc.txt");
	        
	       byte b[]=str.getBytes();
	       
	       fis.write(b);
	       fis.flush();
	       //fis.close();
	       
	    }
	    catch(Exception e){
	        System.out.println(e);
	    }
	}
}	