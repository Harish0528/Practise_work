62. Write a java program to print all unique elements in the array.
import java.util.Scanner;
import java.util.*;
public class Unique {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements: ");
        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();   
        for (int j = 0; j < arr.length; j++) {   
            hm.put(arr[j], j);   
        }   
        System.out.println(hm.keySet());   
    }
}