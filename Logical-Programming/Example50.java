50. Write a java program to print all negative elements in an array.
import java.util.Scanner;
public class AllNegative {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = sc.nextInt();
        int arr[] =new int[size];
        System.out.println("ENter array elements: ");
        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
        int j=0;
        while(j < arr.length) {
			if(arr[j] < 0) {
				System.out.format("%d ", arr[j]);
			}
			j++;
		}
    }
}