package arryalist;

import java.util.ArrayList;

public class Mainclass {

	public static void main(String[] args) {
		
		ArrayList<Integer> arraylist= new ArrayList<Integer>(5);
		arraylist.add(3);
		arraylist.add(5);
		arraylist.add(4);
		arraylist.add(7);
		
		for (Integer integer : arraylist) {
			System.out.println(integer);
			
		}
		
		System.out.println("size of the array"+arraylist.size());
		
		arraylist.remove(2);
		System.out.println(arraylist.size());
		
		arraylist.set(0, 100);
		for (Integer integer : arraylist) {
			System.out.println(integer);
			
		}
		System.out.println(arraylist.get(0));

	}

}
