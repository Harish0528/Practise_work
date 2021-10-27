import java.util.Scanner;
public class example76 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);

      System.out.print("enter a string : ");
      String str=scan.nextLine();
      char arr[]=str.toCharArray();
       int count=0;
      
      for(int i=0;i<str.length();i++){
          for(int j=i+1;j<str.length();j++){
              if(arr[i]==arr[j]){
                  arr[j]=' ';
                  count++;
              }
          }
          
          if(count>0 && arr[i]!=' '){
              System.out.println(" The frequency of "+str.charAt(i)+" is "+count);
          }
          count=0;
      }
	}
}	