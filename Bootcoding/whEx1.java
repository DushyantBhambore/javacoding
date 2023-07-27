import java.util.*;
public class whEx1{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any digits =");
		int num = sc.nextInt();
		int count =0;
		while(num !=0){
		num = num / 10;
		count++;
		}
		System.out.println("Number of digit of a given number is = "+count);
	}
}
		