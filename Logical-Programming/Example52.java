52. Write a java program to find maximum and minimum element in an array. 
import java.util.Scanner;
public class MaxMin {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements: ");
        for(int i=0;i<size;i++) {
            arr[i] =sc.nextInt();
        }
        MaxMin mm = new MaxMin();
        System.out.println("The maximum element of an array is: " +mm.max(arr));
        System.out.println("The minimum element of an array is: " +mm.min(arr));
    }
    public int max(int [] arr) {
        int max = 0;
        for(int i=0; i<arr.length; i++ ) {
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
    }
    public int min(int [] arr) {
        int min = arr[0];
        for(int i=0; i<arr.length; i++ ) {
            if(arr[i]<min) {
                min = arr[i];
            }
        }
        return min;
    }
}