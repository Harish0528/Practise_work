89.//WAP to Display the ATM Transaction
import java.util.*;
import java.io.*;
// The class account 
class Account {
	//scanner to take input
	Scanner sc = new Scanner(System.in);
	// define common variables
	long bal, dep, total;
	// Constructor for the class
	public Account() {
		bal=0;
	}
	// Take Initial status as input
	public void input() {
		System.out.print("Enter Balance: ");
		bal = sc.nextLong();
	}
	// Display Status of Account
	public void display() {
		System.out.println("Balance " + bal );
	}
	// Deposit Amount in Account
	public void deposit() {
		// define long variable
		System.out.println("Enter the amount to deposit: ");
		// take input
		dep = sc.nextLong();
		// add to total 
		total = bal + dep;
	}
}
// Saving Account class whose parent class is Account
class savAccount extends Account {
	double roi=0;
	public long compInt() {
		long time,rate;
		rate=10;
		System.out.println("Enter time: ");
		// take input for time
		time = sc.nextLong();
		//calculating interest and return it
		roi = bal*Math.pow(1+rate/100,time)-bal;
		long roi1 = (long)roi;
		return roi1;
	}
	// Update balance after adding interest
	public void updateBalance(){
		bal += compInt();
    }
    // Withdraw amount from account
    public void withDrawal(){
		long with_Drawn;
		System.out.println("Enter amount to withdrawn: ");
		// input for amount to withdrawn 
		with_Drawn = sc.nextLong();
		//checking if account has enough amount for withdrawl else print "The amount cannot be withdrawn"
		if(bal>=with_Drawn) {
			bal -= with_Drawn;
		}
		else {
			System.out.println("The amount cannot be withdrawn");
		}
    }
}
// current account whose parent class is account
class currAccount extends Account {
	int chqbk;
	int penal;
	// Maintain Minimum Balance
	public long minBalance() {
		long ret=1;
	    // check for Penalty, if balance <=500, else print "No penality imposed"
		if(bal <= 500) {
			penal=50;
			bal=bal-penal;
			ret=0;
		}
		else {
			System.out.println("No Penality imposed");
		}
		return ret;
	}
	// Withdraw amount from account
	public void withDrawal(){
		long curWithDrawn;
		System.out.println("Enter amount to withdrawn: ");
		// take input
		curWithDrawn = sc.nextLong();
		// call minBalance here and apply if, else condition
		long k=minBalance();
		if(k==1) {
			if(bal>=curWithDrawn) {
				bal=bal-curWithDrawn;
			}
		}
		else {
			System.out.println("The amount cannot be withdraw");
		}
	}
}
public class BankApplication {
	public static void main(String args[]) {
		long t=1;
		//declaring object
		savAccount s1 = new savAccount();
		currAccount c1 = new currAccount();
		// commands for any object
		c1.input();
	    c1.deposit();
	    c1.withDrawal();
	    c1.display();
		s1.input();
	    s1.deposit();
	    s1.withDrawal();
	    s1.display();
	}
}