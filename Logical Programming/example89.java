import java.util.Scanner;
class BankAccount{
    private String accountNum;
    private double balance;
    public BankAccount(String acctNum, double initialBalance)
    {
        accountNum = acctNum;
        balance = initialBalance;
    }
    public void deposit(double amount)	
    {
        double newBalance = balance + amount;
        balance = newBalance;
        System.out.println("balance :"+balance);			
    }
    public void withdraw(double amount)	
    {
        double newBalance = balance - amount;
        balance = newBalance;
         System.out.println("balance :"+balance);
    }
    public String getAccount()	
    {
        return accountNum;		
    }
     public double getBalance()	
    {
        return balance;			
    }
    public void display(){
         System.out.println("Account Number :"+getAccount()+"         "/*"Balance :"+ first.getBalance()*/);
        System.out.println("1.Deposit");
        System.out.println("2.With draw");
        System.out.println("3.Balance Enquiry:");
       System.out.println("4.Exit");
    }
    public void pinvalid(long pinnum){
        if(pinnum==1234){
            display();
        }
        else {
            System.out.println("enter valid pin");
            
        }
    
    }
    
 }    
public class example89
{

    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Enter account number:");
        String acctNum=scan.nextLine();
        double initialBalance=20000;
        BankAccount first = new BankAccount(acctNum, initialBalance);
        System.out.println("enter pin :");
        long pinnum=scan.nextLong();
        first.display();
        int choice=0;
        do{
        if(pinnum==1234){
           System.out.println("enter your choice:");
              choice=scan.nextInt();
           switch(choice){
              case 1:
                System.out.println("Enter amount to deposit:");
                double amount=scan.nextDouble();
                first.deposit(amount);
                break;
              case 2:
                System.out.println("Enter amount to withdraw:");
                double draw=scan.nextDouble();
                if(draw<=(initialBalance-500)){
                  first.withdraw(draw);  
                 }else if(draw==initialBalance){
                     System.out.println("your account will be closed");
                     first.withdraw(draw);
                 }else{
                     System.out.println("Enter valid amount");
                 }
                
                 break;
             case 3:
                System.out.println("your balance is :"+first.getBalance());
                break;
             case 4:
                System.out.println("Exit");
                break;
             
            }
        }
        }while(choice!=4);    
         
    
    
       if(pinnum!=1234){
           System.out.println("enter invalid pin");
       }
    

    }

}