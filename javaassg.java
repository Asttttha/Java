package javaproj;

public class javaassg {
	public static void main(String[] args) {
		/*increasing triangle pattern has outer loop from 1 to n 
		and inner loop from i to n*/
		/*decreasing triangle pattern has outer loop from n to 1
		 * and inner loop from 1 to i*/
		int n =6;
		for(int i=1; i<=n; i++)
		{
			for (int j = 1; j <= i; j++) 
			{
				
				System.out.print(j+"");
			}
			System.out.println(" ");
		}
		

		
		char a='A';
		for(int i=1; i<=3; i++)
		{
			a='A';
			for (int j=1 ; j<=i; j++) 
			{
				System.out.print(a+"");
				a++;
			}
			System.out.println();	
		}
	}

}
