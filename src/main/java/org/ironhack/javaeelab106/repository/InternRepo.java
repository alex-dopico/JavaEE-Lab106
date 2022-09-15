package org.ironhack.javaeelab106.repository;

import lombok.Getter;
import lombok.Setter;
import org.ironhack.javaeelab106.domain.Intern;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class InternRepo {
  /**
   * List<Intern> is a repository for interns.
	 */
	private List<Intern> interns;

	/**
	 * List<Employee> is a repository from employees.
	 */
	public InternRepo() {
    this.interns = new ArrayList<>();
  }

  public boolean addIntern(Intern intern) {
		return this.interns.add(intern);
	}

	public void removeIntern(UUID internID) throws ConcurrentModificationException {
		try {
			for (Intern intern : getInterns()) {
				if (intern.getId().equals(internID)) {
					if (getInterns().remove(intern)) {
						System.out.println("succesfully removed");
					}
				}
			}
		} catch (Exception e) {
			System.out.println("Success but there were some error");
		}
	}

	public Intern getInternByID(UUID id) {
		for (Intern intern : getInterns()) {
			if (intern.getId() == id) {
				return intern;
			}
		}
		System.out.println("This intern is not present in the database.");
		return null;
	}

	public void showInterns() {
		for (Intern intern : getInterns()) {
			System.out.println(intern.toString());
		}
	}
}
