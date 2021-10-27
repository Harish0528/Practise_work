54. Write a java program to count total number of negative elements in an array.
import java.util.Scanner;
public class CountNegative {
    public static void main(String args[]) {
        int nc=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int size = sc.nextInt();
        int arr[] =new int[size];
        System.out.println("Enter array elements: ");
        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < size; i++) {
			if(arr[i] <= 0) {
				nc++;
			}
		}
		System.out.println("Total number of negative elements: " + nc);
    }
}