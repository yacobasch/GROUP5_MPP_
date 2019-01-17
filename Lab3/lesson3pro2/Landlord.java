package lesson3pro2;

import java.util.List;

public class Landlord {
	private String name;
	private List<Building> buildings;

	public Landlord(String name, List<Building> buildings) {
		this.name = name;
		this.buildings = buildings;
	}

	public double totalProfit() {
		double totalProfit = 0.0;
		for (Building b : buildings) {
			totalProfit += b.profit();
		}
		return totalProfit;
	}

	public String getName() {
		return name;
	}

	public List<Building> getBuildings() {
		return buildings;
	}

	@Override
	public String toString() {
		return name;
	}

}
