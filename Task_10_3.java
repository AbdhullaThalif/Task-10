package programming;

public class Circle {
	private double radius;
	   
	   
	   public Circle() {
	      radius = 1.0;
	   }
	   
	   
	  public Circle(double r) {
	      radius = r;
	   }
	   
	   
	  public double getRadius() {
	     return radius; 
	   }
	   
	   
	   public double getCircumference() {
	      return 2*radius*Math.PI;
	   }

}
