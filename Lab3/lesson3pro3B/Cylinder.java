package lesson3pro3B;

public class Cylinder {
	private Circle circle;
	private double height;

	public Cylinder(Circle circle, double height) {
		this.height = height;
		this.circle = circle;
	}

	public double getHeight() {
		return height;
	}

	public double getRadius() {
		return circle.getRadius();
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setRadius(double radius) {
		this.circle.setRadius( radius );
	}

	public double computeVolume() {
		return height * circle.computeArea();
	}

}
