package lesson3pro4;

public class Admin {
	public static double computeTotalRent(Object[] properties) {
		double totalRent = 0;
		for (Object o : properties) {
			Property property = (Property) o;

			totalRent += property.computeRent();
		}
		return totalRent;
	}
}
