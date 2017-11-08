package inheritance;

public class MainInheritance {

	public static void main(String[] args) {
		
		Rectangle rectangle= new Rectangle();
		Triangle triangle = new Triangle();
		
		rectangle.set_value(10, 10);
		triangle.set_value(5, 5);
		
		System.out.println(rectangle.areaOfRectangle());
		System.out.println(triangle.areaOfTriangle());

	}

}
