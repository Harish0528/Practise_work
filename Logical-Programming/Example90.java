90. //WAP to print reverse case of a given string
import java.util.Scanner;
class ReverseString{
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.next();
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        System.out.println(sb);
    }
}