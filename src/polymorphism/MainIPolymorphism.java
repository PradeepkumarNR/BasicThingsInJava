package polymorphism;

public class MainIPolymorphism {

	public static void main(String[] args) {
		
			Bank abc= new BankABC();
			Bank def= new BankDEF();
			System.out.println(abc.get_interest());
			System.out.println(def.get_interest());
			

	}

}
