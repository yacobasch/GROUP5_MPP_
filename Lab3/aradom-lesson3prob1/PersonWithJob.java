package lesson3.prob1.refactored;

public class PersonWithJob {

	private Person person;
	private double salary;

	public double getSalary() {
		return salary;
	}
	
	public Person getPerson() {
		return person;
	}

	PersonWithJob(Person person, double s) {
		this.person = person;
		salary = s;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (!(o instanceof PersonWithJob))
			return false;
		PersonWithJob p = (PersonWithJob) o;
		boolean isEqual = this.person.equals(p.getPerson()) && this.getSalary() == p.getSalary();
		return isEqual;
	}

	public static void main(String[] args) {
		Person p1 = new Person("Joe");
		Person p2 = new Person("Anna");
		PersonWithJob pwj1 = new PersonWithJob(p1, 3000);
		PersonWithJob pwj2 = new PersonWithJob(p1, 3000);
		PersonWithJob pwj3 = new PersonWithJob(p2, 3000);

	

		// A PersonsWithJobs, pswj1 should be equal to pswj2
		System.out.println("pwj1.equals(pwj2)? " + pwj1.equals(pwj2));
		System.out.println("pwj1.equals(pwj3)? " + pwj1.equals(pwj3));
	}

}
