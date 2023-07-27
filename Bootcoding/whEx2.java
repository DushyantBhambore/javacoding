import java.util.*;
public class whEx2{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any digit =");
		int num  = sc.nextInt();
		int sum =0;
		while(num !=0)
		{
			sum = sum + num%10;
			num = num/10;
		}
		System.out.print(" Sum of number of digit is ="+sum);	
	
	}
}