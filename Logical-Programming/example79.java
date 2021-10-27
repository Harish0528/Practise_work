79. WAP to read numbers from a file and write even, odd and prime numbers to separate file.
import java.util.Scanner;
import java.io.*;
public class example79 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    
	    System.out.print("enter numbers : ");
	    String num=scan.nextLine();
	    
	    try{
	        //FileInputStream fis=new FileInputStream("abc.txt");
	        BufferedWriter fos=new BufferedWriter(new FileWriter("xyz.txt"));
	       // int ch=0;
	       // while((ch=fis.read())!=-1){
	            
	       //     System.out.print((int)ch);
	            
	       // }
	       byte b[]=num.getBytes();
	       fos.write(b);
	       
	       fos.flush();
	       
	       //int ch=0;
	       //while((ch=fis.readLine())!=-1){
	           
	       //}
	       
	    }
	    catch(Exception e){
	        System.out.println(e);
	    }
	}
}	
