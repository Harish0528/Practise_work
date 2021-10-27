import java.util.Scanner;
public class example55 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);

      System.out.print("enter array size: ");
      int size=scan.nextInt();
      
      int arr[]=new int[size];
      
      int copy[]=new int[size];
      int i=0,j=0;
       System.out.print("enter elements : ");
       for(i=0;i<arr.length;i++){
           arr[i]=scan.nextInt();
           
       }
       System.out.println("before copy of elements : ");
        for(i=0;i<arr.length;i++){
           
           System.out.print(arr[i]+" ");
       }
       System.out.print("After copy of elements : ");
        for(i=0;i<arr.length;i++){
           
           copy[i]=arr[i];
          
           System.out.print(copy[i]+" ");
           
            
       }
       
	}
}	