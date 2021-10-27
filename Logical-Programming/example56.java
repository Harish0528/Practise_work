56. Write a C program to delete an element from an array at specified position.
import java.util.Scanner;
public class example56 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);

      System.out.print("enter array size: ");
      int size=scan.nextInt();
      
      int arr[]=new int[size];
      
      System.out.println("enter array index: ");
      int index=scan.nextInt();
      
     
      int i=0;
       System.out.print("enter elements : ");
       for(i=0;i<arr.length;i++){
           arr[i]=scan.nextInt();
           
       }
       for(i=0;i<size;i++){
           if(i==index){
               while((i+1)<size){
                   arr[i]=arr[i+1];
                   i++;
               }
           }
       }
       System.out.println(" after deleted array ");
       for(i=0;i<size-1;i++){
           System.out.print(arr[i]+" ");
           
       }
       
	}
}	
