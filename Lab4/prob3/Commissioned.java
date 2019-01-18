package prob3;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public class Commissioned extends Employee {

    public Commissioned(String empId, List<Order> orders, double commission, double baseSalary) {
        super( empId );
        this.orders = orders;
        this.commission = commission;
        this.baseSalary = baseSalary;
    }

    private List<Order> orders;
    private double commission;
    private double baseSalary;

    @Override
    double calcGrossPay(LocalDate dateCurrent) {
        int orderAmt = 0;
        //LocalDate dateLast = null;
        LocalDate dateNow = dateCurrent;

        if (!orders.isEmpty()) {
            // sorted it incase if we are required to use the latest date so to compute the orders of prev. month
            orders.sort( new Comparator<Order>() {
                @Override
                public int compare(Order o1, Order o2) {

                    if (Integer.compare( o1.getOrderDate().getYear(), o2.getOrderDate().getYear() ) > 0)
                        return Integer.compare( o1.getOrderDate().getYear(), o2.getOrderDate().getYear() );
                    return Integer.compare( o1.getOrderDate().getMonthValue(), o2.getOrderDate().getMonthValue() );
                }
            } );

            for (Order order : orders) {
                if (order.getOrderDate().getYear() == dateNow.getYear()) {
                    if (order.getOrderDate().getMonthValue() == dateNow.getMonthValue()) {
                        // System.out.println("Year: " + dateNow.getYear() + " Month: " + dateNow.getMonthValue());
                        orderAmt += order.getOrderAmount();
                    }
                }
            }
        }
        return baseSalary + commission * orderAmt;
    }
}
