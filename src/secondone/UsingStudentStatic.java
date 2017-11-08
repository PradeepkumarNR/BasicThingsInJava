package secondone;

public class UsingStudentStatic {

	public static void main(String[] args) {
		
		StudentStaticExample ram= new StudentStaticExample();
		System.out.println(StudentStaticExample.getNumOfStudents());
		
		
		StudentStaticExample sham= new StudentStaticExample();
		System.out.println(StudentStaticExample.getNumOfStudents());
		
		
		//System.out.println(StudentStaticExample.getNumOfStudents());

	}

}
