package secondone;

public class MainOnUsingStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsingstaticMethods usm= new UsingstaticMethods();
		System.out.println(UsingstaticMethods.doSomething());
		usm.doSomethingElse();
		UsingstaticMethods.num=10;
		System.out.println(UsingstaticMethods.num);
		

	}

}
