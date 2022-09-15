package org.ironhack.javaeelab106.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class Employee {
	private UUID id = UUID.randomUUID();
	private String name;
	private String birthDate;
	private String email;
	private String address;
	private double salary;

	private static final double MAX_SALARY = 50000;

	public Employee (String name, String birthDate, String email, String address) {
		this.name = name;
		this.birthDate = birthDate;
		this.email = email;
		this.address = address;
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
