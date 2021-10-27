import java.util.Scanner;
public class example83 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);

      System.out.print("enter number: ");
      int n=scan.nextInt();
      int n1=n;
      int z=1;
      switch(z){
          case 1:
             int count=0;
            while(n!=0 && n!=1){
           for(int j=2;j<=n/2;j++){
               if(n%j==0){
                   count++;
               }
               
              }
            if(count>=1){
                   System.out.println("not prime");
               }
               else{
                 System.out.println(" prime"); 
              } 
              break;
            }
        case 2:
             int temp=n;
            int sum=0;
            count=0;
            int number=1,rem=0;
              int last=temp;
             while(n!=0){
               n=n/10;
               count++;
            }
           for(int i=1;i<=count;i++){
             rem=temp%10;
             temp=temp/10;
           for(int j=1;j<=count;j++){
             number=number*rem;
           }
           sum=sum+number;
            number=1;
           }
           if(sum==last){
              System.out.println("Amstrong number");
            }
          else{
              System.out.println("Not a Amstrong number");
           }
          
          
        case 3:
              sum=0;
             temp=n1;
            for(int i=1;i<=n1/2;i++){
              if(n1%i==0){
                sum=sum+i;
              }
            }
           if(sum==n1){
              System.out.println(" perfect number ");
            }
           else{
              System.out.println("not a perfect number ");
           }
                
        }
      
      
	}
}	