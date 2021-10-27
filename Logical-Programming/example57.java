57. Write a C program to count frequency of each element in an array.
import java.util.Scanner;
public class example57 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    System.out.println("enter size:"); 
	    int size=scan.nextInt();
       int arr[]=new int[size];
      System.out.println("enter number:");
      int fr=1;
       for(int i=0;i<arr.length;i++){
       arr[i]=scan.nextInt();
       }
      for(int i=0;i<arr.length;i++){
         
          for(int j=i+1;j<arr.length;j++){
              if(arr[i]==arr[j]){
                  arr[j]=0;
                  fr++;
              }
          }
         if(arr[i]!=0){
        System.out.println(arr[i]+"  frequency: "+fr);  
      } 
      fr=1;
      }
      
	}
}	
