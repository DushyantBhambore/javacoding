import java.util.*;
public class whEx3{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter any digit =");
		int num = sc.nextInt();
		int n =num;
		int temp;
		int p=0;
		while(num!=0)
		{
				temp = num%10;
				p = (p *10)+ temp;
				num = num/10;
				
		}
		System.out.println("Output is =" +p);
		
		if(p == n)
		{
			System.out.println(" is palindrome ");
		}
		else
		{
			System.out.println(" is not palindrome ");
		}

	}
}
			