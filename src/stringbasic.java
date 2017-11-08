import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class stringbasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String mystring="Hello World";
		System.out.println(mystring);
		int mystringlength= mystring.length();
		System.out.println(mystringlength);
		
		String mystringLowerCase= mystring.toLowerCase();
		System.out.println(mystringLowerCase);
		
		String mystringUpperCase=mystring.toUpperCase();
		System.out.println(mystringUpperCase);
		
		System.out.println(mystring.replace("e", "a"));
		
		String a="main";
		
		char b="main".charAt(2);
		System.out.println(b);
		
		String quote= "one plus one is two";
		int place=quote.indexOf("is");
		System.out.println(place);
		
		int len= quote.length();
		System.out.println(len);
		
		String s1= "hello";
		
		String s3= new String("hello");
		System.out.println(s1==s3);
		
		String S1= "hello helloasshddord hello hello world";
		System.out.println(S1.matches("(.*)world"));
		
		Pattern pattern= Pattern.compile("hello");
		Matcher matcher=pattern.matcher(S1);
		int occurances=0;
		while(matcher.find()){
			occurances++;
		}
		System.out.println(occurances);
		
	
		

	}

}
