60. Write a java program to delete an element from an array at specified position.
import java.util.Scanner;
public class DeleteArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements: ");
        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the position to be deleted: ");
        int p = sc.nextInt();
        for(int i=p;i<size-1;i++) {
            arr[i]=arr[i+1];
        }
        size = size-1;
        System.out.println("New array is: ");
        for(int i=0;i<size;i++) {
            System.out.println("a["+i+"] = "+arr[i]);
        }
    }
}