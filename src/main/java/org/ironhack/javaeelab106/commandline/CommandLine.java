package org.ironhack.javaeelab106.commandline;

import org.ironhack.javaeelab106.domain.Employee;
import org.ironhack.javaeelab106.domain.Intern;
import org.ironhack.javaeelab106.repository.EmployeeRepo;
import org.ironhack.javaeelab106.repository.InternRepo;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import java.util.UUID;

@ShellComponent
public class CommandLine implements ICommandLine {
	private EmployeeRepo employees = new EmployeeRepo();
	private InternRepo interns = new InternRepo();

	public EmployeeRepo getEmployeeRepo() { return this.employees; }
	public InternRepo getInternRepo() { return this.interns; }

	@Override
	@ShellMethod(value="add some dummy employees", key="reg-dummy")
	public void addDummy () {
		Employee employee1 = new Employee("Balin", "3013-12-15", "balin@khazaddum.org", "13th Bridge of Khazad-Dum");
		getEmployeeRepo().addEmployee(employee1);
		Employee employee2 = new Employee("Thorin", "3050-05-01", "thorin.oak@shield.gov", "Misty Mountains Drive");
		getEmployeeRepo().addEmployee(employee2);
		Employee employee3 = new Employee("Gandalf", "0000-00-00", "olorin@visitvalinor.com", "Prancing Poney Inn");
		getEmployeeRepo().addEmployee(employee3);
		Employee employee4 = new Employee("Balrog", "1567-08-11", "balrog@veryhotmail.com", "-5 Bridge of Khazad-Dum");
		getEmployeeRepo().addEmployee(employee4);
		Employee employee5 = new Employee("Isildur", "6584-8-45", "ringoffire@numenor.gov", "Forge Street");
		getEmployeeRepo().addEmployee(employee5);
		Intern intern1 = new Intern("Miles Morales", "2000-10-15", "thwip@thwip.thwip", "Some NY street", 25000.00);
		getInternRepo().addIntern(intern1);
		Intern intern2 = new Intern("Amadeus Cho", "2001-12-3", "smash@hulk.gov", "Las Vegas", 18000.00);
		getInternRepo().addIntern(intern2);
		Intern intern3 = new Intern("Victor Mancha", "2004-05-04", "nomanches@wey.com", "Vision's", 10000.00);
		getInternRepo().addIntern(intern3);
		Intern intern4 = new Intern("Cassie Lang", "2002-05-04", "grow@shrink.org", "Ant-Cave", 23000.00);
		getInternRepo().addIntern(intern4);
		Intern intern5 = new Intern("Kamala Khan", "2000-15-13", "ms@marvel.pow", "Jersey City", 20000.00);
		getInternRepo().addIntern(intern5);
	}

	@Override
	@ShellMethod(value="specify values for each employee you want to create", key="reg-custom-emp")
	public void addCustomEmp (String name, String birthDate, String email, String address) {
		Employee customEmployee = new Employee(name, birthDate, email, address);
		getEmployeeRepo().addEmployee(customEmployee);
	}

	@Override
	@ShellMethod(value="specify values for each intern you want to create", key="reg-custom-intern")
	public void addCustomIntern (String name, String birthDate, String email, String address, double salary) {
		Intern customIntern = new Intern(name, birthDate, email, address, salary);
		getInternRepo().addIntern(customIntern);
	}

	@Override
	public void raiseSalary (double raise) {

	}

	@Override
	@ShellMethod(value="shows actual employees in the system.", key="show-emp")
	public void showEmployees () {
		getEmployeeRepo().showEmployees();
	}

	@Override
	@ShellMethod(value="shows actual interns in the system.", key="show-interns")
	public void showInterns () {
		getInternRepo().showInterns();
	}

	@Override
	@ShellMethod(value="removes an employee from the system.", key="remove-emp")
	public void removeEmp (UUID id) {
		getEmployeeRepo().removeEmployee(id);
	}

	@Override
	@ShellMethod(value="removes an intern from the system.", key="remove-intern")
	public void removeIntern (UUID id) {
		getInternRepo().removeIntern(id);
	}
}
