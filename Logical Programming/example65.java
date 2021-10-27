import java.util.Scanner;
public class example65 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    System.out.println("enter String:"); 
	    String str=scan.next();
	    
	    int alpa=0,digit=0,special=0;
	    for(int i=0;i<str.length();i++){
	       if((str.charAt(i)>='A' && str.charAt(i)<='Z') || (str.charAt(i)>='a' && str.charAt(i)<='z') ){
	           alpa++;
	       }else if(str.charAt(i)>='0' && str.charAt(i)<='9'){
	           digit++;
	       }   
	       else{
	           special++;
	       }
	        
	    }
	    
	    System.out.println("Alphabets count :"+alpa);
	    System.out.println("digits count :"+digit);
	     System.out.println("Special characters  :"+special);
	}
}	