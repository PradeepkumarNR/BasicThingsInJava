package recursion;

public class Mainofrecursion {
	
	public static int caluculateFactorial(int n){
		
		if(n<=1){
			return 1;
		}
		else return (n*caluculateFactorial(n-1));
		
	}
	
	public static void main(String[] args){
		System.out.println(caluculateFactorial(4));
	}

}
