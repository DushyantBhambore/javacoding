
public class arm{
	public static void main(String args[]){
		
		int num =371;
		int n =num;
		int temp;
		int count =0;
		while(num!=0)
		{
			temp = num %10;
			temp = temp * temp *temp;
			count = count + temp ;
			num = num / 10;
		}
		System.out.println(count);
		
		if (count == n)
		{
			System.out.println(" The given number "+n+ " is arm strong number ");
		}
		else
		{
			System.out.println(" The given number "+n+" is not arm strong number ");
		}
	}
}
			