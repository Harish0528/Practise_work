import java.util.Scanner;
public class example88 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);

      System.out.print("enter array size: ");
      int size=scan.nextInt();
      
      int arr[]=new int[size];
      int i=0;
       System.out.print("enter elements : ");
       for(i=0;i<arr.length;i++){
           arr[i]=scan.nextInt();
           
       }
       for(i=0;i<arr.length;i++){
        if(i%2==0){
            System.out.print(arr[i]+" ");
        }
       }
	}
}	