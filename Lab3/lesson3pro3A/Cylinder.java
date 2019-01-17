package lesson3pro3A;

public class Cylinder {
	private double radius;
	private double height;

	public Cylinder(double radius, double height) {
		this.height = height;
		this.radius = radius;
	}

	public double getHeight() {
		return height;
	}

	public double getRadius() {
		return radius;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double computeVolume() {
		return height * radius * Math.PI;
	}

}
