import java.util.*;
public class zero{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter any number = ");
		int num =sc.nextInt();
		int n= num;
		int count=0;
		
		while(num !=0){
			if ( num % 2==0)
			{
				num = num/2;
				count++;
			}
			else
			{
				num = num-1;
				count++;
			}
			
		}
	System.out.println("Number of iteration should be perfomed for given number "+n+" is = "+count);
	}
}