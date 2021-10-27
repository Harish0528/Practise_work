20. Write a java program to print all even numbers between 1 to 100. - using while     loop
//import java.util.Scanner;
public class example20 {
	public static void main(String[] args) {
	    //Scanner scan=new Scanner(System.in);
	    
	    int i=2;
	    
	    while(i<=100){
	       if(i%2==0){ 
	        System.out.print(i+" ");
	        
	       }
	       i++;
	    }
	}
}	
