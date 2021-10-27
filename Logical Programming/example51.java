import java.util.Scanner;
public class example51 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);

      System.out.print("enter  size: ");
      int size=scan.nextInt();
      int smax=0,max=0,num=0;
      
      System.out.print("enter  values: ");
      max=scan.nextInt();
      
      for(int i=1;i<size;i++){
          num=scan.nextInt();
          
          if(max<num){
              smax=max;
              max=num;
          }
          
          else if(smax<num){
              smax=num;
          }
          
      }
      System.out.println("max :"+max);
      System.out.print("smin :"+smax);
	}
}	