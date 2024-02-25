package programming;

public class ConstructorCircleClass {

	public static void main(String[] args) {
	      Circle objc1 = new Circle();
	      System.out.println("The Circle Radius of " 
	         + objc1.getRadius() + " and Circumference of " + objc1.getCircumference());
	      Circle objc2 = new Circle(2.0);
	      System.out.println("The Circle Radius of " 
	         + objc2.getRadius() + " and Circumference of " + objc2.getCircumference());
	   }
}

//Output

//The Circle Radius of 1.0 and Circumference of 6.283185307179586
//The Circle Radius of 2.0 and Circumference of 12.566370614359172