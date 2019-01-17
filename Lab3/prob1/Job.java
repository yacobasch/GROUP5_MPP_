package prob1;

public class Job {

    private double salary;

    public double getSalary() {
        return salary;
    }

    Job(double s) {
        salary = s;
    }


    public static void main(String[] args) {
        Job j = new Job( 30000 );
        Person p1 = new Person( "Joe", j );
        Person p2 = new Person( "Joe" );
        //As PersonsWithJobs, p1 should be equal to p2
        System.out.println( "p1.equals(p2)? " + p1.equals( p2 ) );
        System.out.println( "p2.equals(p1)? " + p2.equals( p1 ) );
    }


}
