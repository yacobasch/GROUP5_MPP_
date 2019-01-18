package prob3;

import java.time.LocalDate;

public class Hourly extends Employee {

    private double hourlyWage;
    private double hoursPerWeek;

    public Hourly(String empId, double hourlyWage, double hoursPerWeek) {
        super( empId );
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    double calcGrossPay(LocalDate dateCurrent) {
        return 4*hourlyWage*hoursPerWeek;
    }
}
