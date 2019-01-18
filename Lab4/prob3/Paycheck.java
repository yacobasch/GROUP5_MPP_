package prob3;

final class Paycheck {
    private double grossPay;
    static final private double FICA = 0.23;
    static final private double STATE = 0.05;
    static final private double LOCAL = 0.01;
    static final private double MEDICARE = 0.03;
    static final private double SOCIALSECURITY = 0.075;

    Paycheck(double grossPay) {
        this.grossPay = grossPay;
    }

    String print() {
        String str = String.format( "fica:- %.2f |state:- %.2f |local:- %.2f |medicare:- %.2f |social security:- %.2f |Get net pay:- %.2f ", FICA * grossPay
                , STATE * grossPay
                , LOCAL * grossPay
                , MEDICARE * grossPay
                , STATE * grossPay
                , getNetPay() );
        return str;
    }

    double getNetPay() {
        return grossPay * (1 - (FICA + STATE + LOCAL + MEDICARE + SOCIALSECURITY));
    }

    @Override
    public String toString() {
        return print();
    }
}
