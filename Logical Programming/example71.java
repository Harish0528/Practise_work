import java.util.Scanner;
public class example71 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);

      System.out.print("enter a string : ");
      String str=scan.nextLine();
      
      System.out.print("enter a character : ");
      char ch=scan.next().charAt(0);
      int i=str.length()-1,count=0;
      while(i>=0){
          
          if(ch==str.charAt(i)){
              count++;
          }
          
          
          if(count==1){
          System.out.println("The last ocurrence of :"+ch+" is "+i);
          
          break;
          }
          i--;

	}
}
}