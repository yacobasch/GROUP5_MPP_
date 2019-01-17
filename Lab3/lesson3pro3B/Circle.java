package lesson3pro3B;

public class Circle {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public  void setRadius(double radius){this.radius = radius;}
	public double getRadius() {
		return radius;
	}

	public double computeArea() {
		return Math.PI * getRadius() * getRadius();
	}

}
