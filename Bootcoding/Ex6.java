import java.util.*;
public class Ex6{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a hour =");
		double hr = sc.nextDouble();
		double min = hr * 60;
		double sec = hr * 60 * 60;
		System.out.println("The Gien Number "+hr+"  in minutes is ="+min+" min");
		System.out.println("The Given Number "+hr+" in second  is ="+sec+" sec");
	}
	
}