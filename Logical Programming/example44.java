import java.util.Scanner;
public class example44 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);

      System.out.print("enter number: ");
      int range=scan.nextInt();
      
      
      int sum=0,count=0,number=1,rem=0;
      
      for(int k=1;k<=range;k++){
          int temp=k;
          int temp1=temp;
         while(temp1!=0){
           temp1=temp1/10;
           count++;
          }
         int last=temp; 
         for(int i=1;i<=count;i++){
           rem=temp%10;
           temp=temp/10;
           for(int j=1;j<=count;j++){
             number=number*rem;
            }
            sum=sum+number;
            number=1;
         }
         count=0;
         if(sum==last){
         
         System.out.print(sum+" "); 
         
         }
         sum=0;
      }
      
      
	}
}	