import java.util.Scanner;
public class example73 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);

      System.out.print("enter a string : ");
      String str=scan.nextLine();
      
      System.out.print("enter a character : ");
      char ch=scan.next().charAt(0);
      int i=0,count=0;
      while(i<str.length()){
          
          if(ch==str.charAt(i)){
              count++;
          }
         
          i++;
      }
      System.out.println("The count of occurence is :"+count);
      
      
	}
}	