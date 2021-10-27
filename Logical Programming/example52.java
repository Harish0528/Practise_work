import java.util.Scanner;
public class example52 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);

      System.out.print("enter  size: ");
      int size=scan.nextInt();
      int min=0,max=0,num=0;
      
      System.out.print("enter  values: ");
      max=scan.nextInt();
      min=max;
      
      for(int i=1;i<size;i++){
          num=scan.nextInt();
          
          if(max<num){
              max=num;
          }
          
          if(min>num){
              min=num;
          }
          
      }
      System.out.println("max :"+max);
      System.out.print("min :"+min);
	}
}	