42. Write a java program to find all prime factors of a number.
public class Example3 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int x,count=0;	
		System.out.println("Enter number:");
		int n=s.nextInt();
		System.out.print("Prime Factors of given number is: ");
		for(int i=2; i<n/2 ; i++){
			if(n%i==0) {
				x=i;
				for(int j=1 ; j<x; j++){
					if(i%j==0) {
						count++;
					}				
				}
			}
			if(count==1) {
				System.out.print(i+" ");
			}
			count=0;
		}
	 }
}