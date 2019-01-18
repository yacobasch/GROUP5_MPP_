package prob3;

import java.time.LocalDate;

public class Order {

    private int orderNo;
    private LocalDate orderDate;
    private int orderAmount;

    public Order(int orderNo, LocalDate orderDate, int orderAmount) {
        this.orderNo = orderNo;
        this.orderDate = orderDate;
        this.orderAmount = orderAmount;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public int getOrderAmount() {
        return orderAmount;
    }

    @Override
    public String toString() {
        return " Order No: " + orderNo + " Order Amount: "+orderAmount + " Order Date: "+orderDate;
    }
}
