import java.util.Scanner;
public class example69 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);

      System.out.print("enter a string : ");
      String str=scan.nextLine();
      
     
           
     String reverse="";
      for(int i=str.length()-1;i>=0;i--){
        
            reverse=reverse+str.charAt(i);
            
          
      }
      
      if(str.equals(reverse)){
          System.out.println("palindrome");
      }
      else{
          System.out.println("not palindrome");
      }
	}
}	