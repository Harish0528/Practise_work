import java.util.Scanner;
public class example75 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);  
	 
      System.out.print("enter a string : ");
      String str=scan.nextLine();
      char arr[]=str.toCharArray();
       int count=0,i=0;
       int low=arr.length;
       char ch=' ';
      for(i=0;i<str.length();i++){
          for(int j=i+1;j<str.length();j++){
              if(arr[i]==arr[j]){
                  arr[j]=' ';
                  count++;
              }
          }
          
          if(count<low && arr[i]!=' '){
              low=count;
              ch=arr[i];
              
          }
          count=0;
      }
      System.out.println(" The minimum frequency of "+ch+" is "+low);
	}
}	