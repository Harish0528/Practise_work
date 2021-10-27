63. Write a java program to count total number of duplicate elements in an array.
import java.util.Scanner;
public class Duplicate {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements: ");
        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Duplicate elements in given array: ");  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j]) { 
                    System.out.println(arr[j]);
                }
            }
        }
    }
}