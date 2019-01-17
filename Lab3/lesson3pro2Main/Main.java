package lesson3pro2Main;

import java.util.ArrayList;
import java.util.List;

import lesson3pro2.Apartment;
import lesson3pro2.Building;
import lesson3pro2.Landlord;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Apartment> apartments = new ArrayList<>();
		apartments.add(new Apartment(2000));
		apartments.add(new Apartment(3000));
		apartments.add(new Apartment(4000));
		List<Building> buildings = new ArrayList<>();
		buildings.add(new Building(200, apartments));
		buildings.add(new Building(300, apartments));
		buildings.add(new Building(400, apartments));
		Landlord landlord = new Landlord("Bob", buildings);
		System.out.println("total profit of landlord " + landlord.totalProfit());

	}

}
