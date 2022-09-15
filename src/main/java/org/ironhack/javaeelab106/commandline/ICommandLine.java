package org.ironhack.javaeelab106.commandline;

import org.ironhack.javaeelab106.domain.Employee;
import org.ironhack.javaeelab106.domain.Intern;

import java.util.UUID;

public interface ICommandLine {
	void getEmployeeById(UUID id);
	void  getInternById(UUID id);
	void addDummy();
	void addCustomEmp(String name, String birthDate, String email, String adddress);
	void addCustomIntern(String name, String birthDate, String email, String adddress, double salary);
	void raiseSalary(UUID id, double raise);
	void showEmployees();
	void showInterns();
	void removeEmp(UUID id);
	void removeIntern(UUID id);
}
