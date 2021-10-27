41. Write a java program to find sum of all prime numbers between 1 to n.

	public class Example3 {


		public static void main(String args[]) {
			
			Scanner s=new Scanner(System.in);
			
			
			int count=0,sum=0;
			
			System.out.println("Enter number:");
	        int n=s.nextInt();
	        
	        
	        System.out.println("Prime numbers between 1 and "+n+" are :");   
	        for(int i=1 ; i<=n ; i++)
			{
			    count = 0;
				for(int j=1 ; j<=i ; j++)	
				{
				    if(i%j==0)
						count++;
				}
				if(count == 2) {
					sum=sum+i;
					System.out.print(i+" ");
				}
				 
	    }
	        System.out.println("\nsum of 1 to "+n+" is :"+sum);
		}
}