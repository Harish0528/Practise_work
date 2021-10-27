15. Write a java program to input electricity unit charges and calculate total     electricity bill according to the given condition:
    For first 50 units Rs. 0.50/unit
    For next 100 units Rs. 0.75/unit
    For next 100 units Rs. 1.20/unit
    For unit above 250 Rs. 1.50/unit
    An additional surcharge of 20% is added to the bill

import java.util.Scanner;
public class example15{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("enter number of units:");
        double units=scan.nextDouble();
        if(units<=50){
        System.out.println("your current bill amount to be paid:"+(0.5*units));
        }
        else if(units<=150){
            System.out.println("your current bill amount to be paid:"+(0.5*50+(50-units)*1.20));
        }
        else if(units<=250){
            System.out.println("your current bill amount to be paid:"+(50*0.5+100*1.20+(150-units)*1.50));
        }
        else{
            double amt=(50*0.5+100*1.20+100*1.50+(250-units)*1.75);
            double bill=amt+((amt*20)/100);
            System.out.println("your current bill amount to be paid:"+bill);
        }
    }
}
