16. Write a java program to print day of week name using switch case.
import java.util.Scanner;
public class example16 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    
	    System.out.println("enter a day");
	    int day=scan.nextInt();
	    switch(day){
	        case 0:
	            System.out.println("Sunday");
	            break;
	       case 1:
	            System.out.println("Monday");
	            break;
	       case 2:
	            System.out.println("Tuesday");
	            break;
	       case 3:
	            System.out.println("Wednesday");
	            break;
	       case 4:
	            System.out.println("Thursday");
	            break;
	       case 5:
	            System.out.println("Friday");
	            break;
	       case 6:
	            System.out.println("Saturday");
	            break; 
	       default:
	            System.out.println("Invalid day");
	            break;     
	    }
  }
}
