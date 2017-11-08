
public class VariableEncapusilizaition {

	int age;
	String name;
	int id;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static void main(String[] args) {
		VariableEncapusilizaition student= new VariableEncapusilizaition();
		student.setAge(30);
		student.setId(1234);
		student.setName("akj");
		
		System.out.println(student.getName()+ " " + student.age+ " ");

	}

}
