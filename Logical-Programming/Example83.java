83. //WAP to check whether a number is prime, Armstrong or perfect number using functions.
import java.util.Scanner;
public class Check {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num =sc.nextInt();
        System.out.println("Enter the digit according to your choice 1 or 2 or 3 to check the number what you have entered");
        System.out.println("1. Check for primeNumber");
        System.out.println("2. Check for Armstrong Number");
        System.out.println("3. Check for Perfect Number");
        System.out.println("Enter one number :");
        int a = sc.nextInt();
        switch (a){     
        case 1:
            int flag=0;
            for(int i=2;i<num;i++){
                if(num%i==0) {
                    System.out.println(num+" is not a Prime Number");
                    flag = 1;
                    break;
                }
            }
            if(flag==0) {
                System.out.println(num+" is a Prime Number");
            }
            break;
        case 2:
            int n = num;
            int res=0,remainder;
            while(num > 0){
                remainder = num % 10;
                res = res + (remainder*remainder*remainder);
                num = num / 10;
            }
            if(res == n) {
                System.out.println(n+" is an Armstrong Number");
            }
            else {
                System.out.println(n+" is not a Armstrong Number");
            }
            break;
        case 3:
            int perfectNo = 0;               
            int i;             
            System.out.println("Factors are:"); 
            for (i = 1; i < num; i++) {           
                if (num % i == 0) {                              
                    perfectNo += i;           
                    System.out.println(i);  
                }         
            }            
            if (perfectNo == num) {  
                System.out.println("number is a perfect number");         
            }
            else
            {                      
                System.out.println("number is not a perfect number");    
            }
        }
    }
}