import java.util.Scanner;
public class example68 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);

      System.out.print("enter a string : ");
      String str=scan.nextLine();
      
      System.out.println("before string reverse :");
      for(int i=0;i<str.length();i++){
          System.out.print(str.charAt(i)+" ");
      }
      
      System.out.println("after  string reverse :");
      for(int i=str.length()-1;i>=0;i--){
          System.out.print(str.charAt(i)+" ");
      }
	}
}	