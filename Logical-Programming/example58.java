58. Write a program to print all unique elements in the array.
import java.util.Scanner;
public class example58 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    System.out.println("enter size:"); 
	    int size=scan.nextInt();
	    
       int arr[]=new int[size];
       
        System.out.println("enter array elements:");
       for(int i=0;i<size;i++){
           
           arr[i]=scan.nextInt();
       }
       int fr=0;
       for(int i=0;i<size;i++){
           for(int j=i+1;j<size;j++){
             if(arr[i]==arr[j]){
                 fr++;
             }    
           }
           if(fr==0){
               System.out.println(arr[i]+" is a unique element");
           }
           fr=0;
           
       }
	}
}	
