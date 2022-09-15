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
	private List<Employee> employees;

	public EmployeeRepo () {
		this.employees = new ArrayList<Employee>();
	}

	public boolean addEmployee (Employee employee) {
		return this.employees.add(employee);
	}

	public void removeEmployee(UUID employeeID) {
		for (Employee emp : getEmployees()) {
			if (emp.getId() == employeeID) {
				System.out.println("Employee " + emp.getName() + "removed.");
				employees.remove(emp);
			}
		}
	}

	public void showEmployees () {
		for (Employee emp : getEmployees()) {
			System.out.println(emp.toString());
		}
	}
}
