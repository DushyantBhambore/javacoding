public class Conditional{
	public static void main(String a[]){
		double time =20;
		
		if(time >= 12 && time < 18){
			System.out.println("Good Afternoon");
		}
		if(time >= 1 && time < 12 ){
			System.out.println("Good Morning");
		}
		if(time >=18 && time < 24){
			System.out.println("Good Evening");
		}
		if(time > 24){
			System.out.println("Unwanted Data");
		}	
		
	}
}	