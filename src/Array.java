
public class Array {

	public static void main(String[] args) {
		
		int [] intArray= {100,5,60,45,30};
		
		int index = 0;
		while(index<5){
		System.out.println(intArray[index]);
		index++;
		
	}
		System.out.println("============");
		
		for (int i = 0; i < intArray.length; i++) {
		System.out.println(intArray[i]);	
		}
		
		System.out.println("============");
		
		for (int i : intArray) {
			System.out.println(i);
		}
	}

}
