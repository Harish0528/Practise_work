import java.util.Scanner;
public class example72 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);

      System.out.print("enter a string : ");
      String str=scan.nextLine();
      
      System.out.print("enter a character : ");
      char ch=scan.next().charAt(0);
      int i=0,count=0;
      while(i<str.length()){
          
          if(ch==str.charAt(i)){
            
            System.out.println("The  ocurrence of :"+ch+" is "+i);
              
          }
          
          
          i++;
      }
      
      
	}
}	