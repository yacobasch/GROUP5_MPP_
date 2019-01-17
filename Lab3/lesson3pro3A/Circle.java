package lesson3pro3A;

public class Circle extends Cylinder {

	public Circle(double radius) {
		super(radius, 0);
	}

	public double getRadius() {
		return super.getRadius();
	}

	public double computeArea() {
		return Math.PI * super.getRadius() * super.getRadius();
	}

}
