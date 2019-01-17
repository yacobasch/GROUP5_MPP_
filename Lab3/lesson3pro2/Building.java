package lesson3pro2;

import java.util.List;

public class Building {
	private double maintenanceCost;
	private List<Apartment> apartments;

	public Building(double maintenanceCost, List<Apartment> apartments) {
		this.maintenanceCost = maintenanceCost;
		this.apartments = apartments;
	}

	public double getMaintenanceCost() {
		return maintenanceCost;
	}

	public List<Apartment> getApartments() {
		return apartments;
	}

	public double profit() {
		double rentSum = 0.0;
		for (Apartment a : apartments) {
			rentSum += a.getRent();
		}
		return (rentSum - maintenanceCost);

	}

	@Override
	public String toString() {
		return maintenanceCost + "" + apartments.toString();
	}

}
