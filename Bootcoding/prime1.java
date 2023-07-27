import java.util.*;
public class prime1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter a number = ");
		int n =sc.nextInt();
		
		for(int i=0; i<=n; i++)
		{
			if(n%i==0)
			{
				System.out.println(" is prime number = "+n);
			}
			else
			{
				System.out.println(" is not a prime number = "+n);
			}
		}
	}
}