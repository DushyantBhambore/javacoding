import java.util.*;
public  class Ex4{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Time in minutes  =");
		double min = sc.nextDouble();
		double sec = min * 60;
		System.out.println(" The Given Time "+min+"  in second is ="+sec+" sec"); 
	}
}