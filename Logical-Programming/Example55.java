55. Write a java program to copy all elements from an array to another array.
import java.util.Scanner;
import java.util.*;
public class CopyArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size : ");
        int size= sc.nextInt();
        ArrayList<Integer> al = new ArrayList<Integer>(size);
        for(int i=0; i<size; i++) {
            System.out.println("Enter Number : " + i);
            al.add(sc.nextInt());     
        }
        System.out.println();
        System.out.println("-----Iterating over the second ArrayList----");
        ArrayList<Integer> al1 = new ArrayList<Integer>(al);
        for(int j=0 ; j<size; j++){
            System.out.println(al1.get(j));     
        }
    }
}