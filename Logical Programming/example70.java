import java.util.Scanner;
public class example70 {
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
          
          
          if(count==1){
          System.out.println("The first ocurrence of :"+ch+" is "+i);
          
          break;
          }
          i++;
      }
      
      
	}
}	