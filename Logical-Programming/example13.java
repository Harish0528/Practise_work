13. Write a java program to input marks of five subjects Physics, Chemistry, Biology,Mathematics and Computer. Calculate percentage and grade according to following:
    Percentage >= 90% : Grade A
    Percentage >= 80% : Grade B
    Percentage >= 70% : Grade C
    Percentage >= 60% : Grade D
    Percentage >= 40% : Grade E
    Percentage < 40%  : Grade F
    
import java.util.Scanner;
public class example13 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    
	    System.out.println("enter 5 subjects marks out of 100");
        int sub1=scan.nextInt();
        int sub2=scan.nextInt();
        int sub3=scan.nextInt();
        int sub4=scan.nextInt();
        int sub5=scan.nextInt();
        
        int sum=sub1+sub2+sub3+sub4+sub5;
        
        int percentage=(sum*100)/500;
        
        if(percentage>=90){
            char grade='A';
            System.out.println("percentage is "+percentage+"  "+"Grade is:"+grade);
        }
        else if(percentage<90 && percentage>=80){
            char grade='B';
            System.out.println("percentage is "+percentage+"  "+"Grade is:"+grade);
        }
        else if(percentage<80 && percentage>=70){
            char grade='C';
            System.out.println("percentage is "+percentage+"  "+"Grade is:"+grade);
        }
        
        else if(percentage<70 && percentage>=60){
            char grade='D';
            System.out.println("percentage is "+percentage+"  "+"Grade is:"+grade);
        }
        
        else if(percentage<60 && percentage>=40){
            char grade='E';
            System.out.println("percentage is "+percentage+"  "+"Grade is:"+grade);
        }
        else{
            char grade='F';
            System.out.println("percentage is "+percentage+"  "+"Grade is:"+grade);

        }
        
        
}
}
