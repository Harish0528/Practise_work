import java.util.Scanner;
public class example41 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);

      System.out.print("enter number: ");
      int n=scan.nextInt();
      int sum=0;
       for(int i=2;i<n;i++){
           int count=0;
           for(int j=1;j<i;j++){
               if(i%j==0){
                   count++;
               }
           }
           if(count==1){
               sum=sum+i;
               System.out.println(i+" ");
           }
       }
       System.out.println("sum of prime numbers :"+sum);
	}
}	