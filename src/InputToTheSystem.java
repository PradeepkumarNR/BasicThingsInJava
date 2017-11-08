import java.util.Scanner;

public class InputToTheSystem {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int number=scan.nextInt();
		
		System.out.println("the number entered is ");
		System.out.println(number);
		
		Scanner scandecimal = new Scanner(System.in);
		System.out.println("enter a decimal value");
		double decimalnumber= scandecimal.nextDouble();
		
		System.out.println("entered decimal is ");
		System.out.println(decimalnumber);

	}

}
