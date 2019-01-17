package lesson3pro2;

public class Apartment {
	private double rent;

	public Apartment(double rent) {
		this.rent = rent;

	}

	public double getRent() {
		return rent;
	}

	@Override
	public String toString() {
		return rent + "";
	}

}
