package org.ironhack.javaeelab106.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Intern extends Employee{
	/**
	 * Extends the base class 'Employee' to create 'Intern'
	 * employees. An intern adds a salary cap that is
	 * checked at instantiation time.
	 *
	 * @author Alex Dopico
	 * @version 1.0
	 * @since 2022-09-15
	 */
	private static final double SALARY_LIMIT = 20000.00;

	public Intern (String name, String birthDate, String email, String address, double salary) {
		super(name, birthDate, email, address);
		setSalary(salary);
	}

	public void setSalary (double salary) {
		if (salary > SALARY_LIMIT) {
			System.out.println(getName() + " salary greater than maximum specified. Intern won't be created.");
		} else {
			super.setSalary(salary);
			System.out.println(getName() + " salary set to: " + getSalary());
		}
	}

	public void raiseSalary (double raise) {
		if (getSalary() + raise >= SALARY_LIMIT) {
			System.out.println(getName() + "'s raise will exceed the maximum salary, setting to maximum allowed.");
			setSalary(SALARY_LIMIT);
		} else {
			setSalary(getSalary() + raise);
			System.out.println(getName() + "\'s new salary: " + getSalary());
		}
	}

	@Override
	public String toString() {
		return getId() + "____________________________\n" +
		getName() + ", " +
		getEmail() + ", " +
		getAddress() +  ", "+
		getSalary() + "\n";
	}
}
