14. Write a java program to input basic salary of an employee and calculate its Gross     salary according to following:
    Basic Salary <= 10000 : HRA = 20%, DA = 80%
    Basic Salary <= 20000 : HRA = 25%, DA = 90%
    Basic Salary > 20000 : HRA = 30%, DA = 95%
	    
import java.util.Scanner;
public class example14 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    
	    System.out.println("enter salary");
	    double salary=scan.nextDouble();
	    int amt=0;
	    if(salary<=10000){
	       
	         System.out.println("Hra is :"+((salary*20)/100));
	         System.out.println("Da is :"+((salary*80)/100));
	         System.out.println("gross salary is :"+(((salary*20)/100)+((salary*80)/100)));
	    }
	    else if(salary<=2000){
	        System.out.println("Hra is :"+((salary*25)/100));
	         System.out.println("Da is :"+((salary*90)/100)); 
	          System.out.println("gross salary is :"+(((salary*25)/100)+((salary*90)/100)));
	    }
	    else{
	         System.out.println("Hra is :"+((salary*30)/100));
	         System.out.println("Da is :"+((salary*95)/100));
	          System.out.println("gross salary is :"+(((salary*30)/100)+((salary*95)/100)));
	    }
 }
}
