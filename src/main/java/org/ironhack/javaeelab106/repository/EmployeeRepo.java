package org.ironhack.javaeelab106.repository;

import lombok.Getter;
import lombok.Setter;
import org.ironhack.javaeelab106.domain.Employee;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
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

	public void removeEmployee(UUID employeeID) throws ConcurrentModificationException {
		try {
			for (Employee emp : getEmployees()) {
				if (emp.getId().equals(employeeID)) {
					if (getEmployees().remove(emp)) {
						System.out.println("succesfully removed.");
					}
				}
			}
		} catch (Exception e) {
			System.out.println("Success but there were some error");
		}
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
		for (Employee emp : getEmployees()) {
			System.out.println(emp.toString());
		}
	}
}
