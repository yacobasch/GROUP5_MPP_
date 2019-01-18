package prob3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Driver {

    static void displayEmpsData(Employee[] emps){
        for (Employee emp : emps) {
            System.out.println("Employee ID: " + emp.getEmpId() + " Gross Pay:-> " +  emp.calcGrossPay(LocalDate.now()) );
            System.out.println("Employee ID: " + emp.getEmpId() + " Compensation:-> " +  emp.calcCompensation(LocalDate.now()) );
        }
    }

    public static void main(String[] args) {

        //Orders for the commissioned employee
        List<Order> orders = new ArrayList<>();
        orders.add( new Order( 25, LocalDate.of( 2019, 1, 14 ), 2 ) );
        orders.add( new Order( 10, LocalDate.of( 2019, 1, 9 ), 3 ) );
        orders.add( new Order( 15, LocalDate.of( 2018, 12, 16 ), 5 ) );

        Employee[] emps = {new Commissioned( "AR2565",orders, 250, 1014 ), new Salaried("CD48785", 2584 ), new Hourly( "CY8978",15, 40 )};
        displayEmpsData( emps );
    }
}
