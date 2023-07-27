import java.util.*;
public class Ex5{
	public static  void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter weight in KG =");
		double kg = sc.nextDouble();
		double pound = kg * 2.20462;
		System.out.println("The Given Number "+kg+ " in pound is ="+pound+" lb");
	}
}