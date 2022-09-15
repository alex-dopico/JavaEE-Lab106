package org.ironhack.javaeelab106.repository;

import lombok.Getter;
import lombok.Setter;
import org.ironhack.javaeelab106.domain.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class EmployeeRepo {
	private Employee employeeToRemove;
	private List<Employee> employees;

	public EmployeeRepo () {
		this.employees = new ArrayList<>();
	}

	public void addEmployee (Employee employee) {
		this.employees.add(employee);
	}

	public void removeEmployee(UUID employeeID) {
			for (Employee emp : getEmployees()) {
				if (emp.getId().equals(employeeID)) {
					employeeToRemove = emp;
				}
			}
			String resultMessage = getEmployees()
			.remove(employeeToRemove)
			? "successfully removed." : "not found or not removed.";

			System.out.println(resultMessage);
	}

	public Employee getEmployeeByID (UUID id) {
		for (Employee emp : getEmployees()) {
			if (emp.getId().equals(id)) {
				return emp;
			}
		}

		System.out.println("This employee is not present in the database.");
		return null;
	}

	public void showEmployees () {
		getEmployees().forEach(System.out::println);
	}
}
