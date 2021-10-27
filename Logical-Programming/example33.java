33. Write a java program to find frequency of each digit in a given integer.
import java.util.Scanner;
public class example33 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    System.out.println("enter number:"); 
	    int num=scan.nextInt();
       
        int fr=0,rem=0;
       
         int temp=0;
        for(int i=0;i<=9;i++){
          temp=num;
            while(temp!=0){
             rem=temp%10;
            if(rem==i){
             fr++;
            }
            temp=temp/10;
         }
       if(fr>0){
          System.out.println(i+"  frequency: "+fr);  
        } 
      fr=0;
     }
      
	}
}
