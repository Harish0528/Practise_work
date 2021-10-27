import java.util.Scanner;
public class example90 {    
    public static void main(String[] args) {    
         Scanner scan=new Scanner(System.in);   
        System.out.println("enter a string : ");
        String str1=scan.nextLine();
        StringBuffer newStr=new StringBuffer(str1);    
            
        for(int i = 0; i < str1.length(); i++) {    
                
            
            if(Character.isLowerCase(str1.charAt(i))) {    
                    
                newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));    
            }    
                
            else if(Character.isUpperCase(str1.charAt(i))) {    
                    
                newStr.setCharAt(i, Character.toLowerCase(str1.charAt(i)));    
            }    
        }    
        System.out.println("String after case conversion : " + newStr);    
    }    
}     