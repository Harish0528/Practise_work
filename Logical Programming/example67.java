import java.util.Scanner;
public class example67 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);

      System.out.print("enter a string : ");
      String str=scan.nextLine();
      
      String arr[]=str.split(" ");
      
      System.out.println("number of words : "+arr.length);
	}
}	