import java.util.Scanner;
public class example53 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);

      System.out.print("enter  size: ");
      int size=scan.nextInt();
      
      int[] arr=new int[size];
      
      int even=0,odd=0;
      System.out.print("enter array elements : ");
      
      
      for(int i=0;i<size;i++){
          arr[i]=scan.nextInt();
          if(arr[i]%2==0){
              even++;
          }
          else if(arr[i]%2!=0){
              odd++;
          }
      }
     System.out.println("odd count : "+odd);
      System.out.println("even count : "+even);
	}
}	
     