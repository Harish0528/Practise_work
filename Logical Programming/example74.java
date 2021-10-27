import java.util.Scanner;
public class example74 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);

      System.out.print("enter a string : ");
      String str=scan.nextLine();
      char arr[]=str.toCharArray();
       int count=0;
       int high=0;
       char ch=' ';
      for(int i=0;i<str.length();i++){
          for(int j=i+1;j<str.length();j++){
              if(arr[i]==arr[j]){
                  arr[j]=' ';
                  count++;
              }
          }
          
          if(count>high && arr[i]!=' '){
             high=count;
             ch=arr[i];          
             }
             count=0;
     }
     System.out.println("The frequency of is "+ch+" "+high);
}
}
      