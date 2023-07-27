import java.util.*;
public class cubeEx1{
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter any number =");
	int a =sc.nextInt();
	int c=1;
	
	for(int i=0;i<=a;i++)
	{
		c=i*i*i;
		System.out.println(c);
	}
	}
}