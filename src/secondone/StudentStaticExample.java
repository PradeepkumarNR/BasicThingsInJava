package secondone;

public  class StudentStaticExample {
	
	int age;
	int average;
	static int noOfStudent=0;
	
	public StudentStaticExample() {
		noOfStudent++;
	}
	
	public static int getNumOfStudents(){
		return noOfStudent;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAverage() {
		return average;
	}
	public void setAverage(int average) {
		this.average = average;
	}
	
	

}
