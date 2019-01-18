package prob3;

import java.time.LocalDate;

abstract class Employee {
    private  String empId;
    private LocalDate dateCurrent;

    public Employee(String empId) {
        this.empId = empId;
    }

    public String getEmpId() {
        return empId;
    }

    public Paycheck calcCompensation(LocalDate dateCurrent){
        Paycheck paycheck = new Paycheck( this.calcGrossPay(dateCurrent));
        return paycheck;
    }

    String print(){
        return "Employee Id: " + empId + " Gross Pay: " + calcGrossPay(dateCurrent) + " ";
    }

    abstract  double calcGrossPay(LocalDate dateCurrent);

    @Override
    public String toString() {
        return print();
    }
}
