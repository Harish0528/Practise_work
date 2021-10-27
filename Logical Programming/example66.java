import java.util.Scanner;
public class example66 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    
	    int vowel=0,cons=0;
	    System.out.println("enter a String");
	    String str=scan.next();
	    for(int i=0;i<str.length();i++){
	      if(str.charAt(i)=='a'|| str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' 
	                 || str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U'){
	           vowel++;
	       }
	    else if((str.charAt(i)>='A' && str.charAt(i)<='Z') || (str.charAt(i)>='a' && str.charAt(i)<='z')){
	        cons++;
	    }
	        
	    }
	    
	    System.out.println(" vowels count : "+vowel);
	    System.out.println(" constants count : "+cons);
	    
	}
}