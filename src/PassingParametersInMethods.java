

public class PassingParametersInMethods {

	public static void main(String[] args) {
		
	
		System.out.println(addToNumbers(3, 4));
		System.out.println(addToNumbers(2.3, 4.3));
		System.out.println(addToNumbers("one", "Two"));

	}
	
	public static int addToNumbers(int num1,  int num2){
		return (num1+num2);
		
	}
	
	public static double addToNumbers(double num1,double num2){
		return (num1+num2);
		
	}
	
	public static String addToNumbers(String num1, String num2){
		return (num1+num2);
	}

}
