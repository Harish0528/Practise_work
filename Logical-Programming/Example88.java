88. //WAP to Print the Alternate Elements in an Array
import java.util.Scanner;
public class AlternativeElement {
    public static void main(String[] args) {
        int i, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an arrray: ");
        n = sc.nextInt();
        int a[] = new int[n];
        for (i = 0; i < n; i++) {
            System.out.println("Enter elements in array: " + (i + 1));
            a[i] = sc.nextInt();
        }
        System.out.println("Given array: ");
        for (i = 0; i < n; i++) {
            System.out.println(a[i] + "\t");
        }
        System.out.print("Alternate elements in an array are: ");
        for (i = 0; i < n; i = i + 2) {
            System.out.println(a[i]);
        }
    }
}