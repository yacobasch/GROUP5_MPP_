package lesson3pro4;

public class House extends Property {
	private double lotSize;
	// private double rent;

	public House(double lotSize) {
		this.lotSize = lotSize;
	}

	@Override
	public double computeRent() {
		return 0.1 * lotSize;
	}

}
