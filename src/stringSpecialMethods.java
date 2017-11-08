import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class stringSpecialMethods {

	public static void main(String[] args) {
		String input ="work is worship";
		//System.out.println("enter the string");
		
		try {
			//BufferedReader br= new BufferedReader(new InputStreamReader(input));
			//input= br.readLine();
			char[] try1= input.toCharArray();
			for (int i =  try1.length-1;i>=0 ; i--) {
				System.out.print(try1[i]);;
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("...........");
		
		String input1= "all is well";
		StringBuilder input2= new StringBuilder();
		input2.append(input1);
		input2=input2.reverse();
		System.out.println(input2);
		
		
		// reversing a sentence
		String sentence=" one two three";
		String reversedsentence="";
		StringTokenizer stringtokenizer= new StringTokenizer(sentence);
		while (stringtokenizer.hasMoreTokens()) {
			reversedsentence= stringtokenizer.nextToken()+" "+ reversedsentence;
		}
		System.out.println(reversedsentence.trim());
		
	

	}

}
