package org.ironhack.javaeelab106.repository;

import lombok.Getter;
import lombok.Setter;
import org.ironhack.javaeelab106.domain.Intern;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class InternRepo {
	private Intern internToRemove;
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

  public void addIntern(Intern intern) {
		this.interns.add(intern);
	}

	public void removeIntern(UUID internID) {
			for (Intern intern : getInterns()) {
				if (intern.getId().equals(internID)) {
					internToRemove = intern;
				}
			}

			String resultMessage = getInterns()
			.remove(internToRemove)
			? "successfully removed" : "not found or not removed";

			System.out.println(resultMessage);
	}

	public Intern getInternByID(UUID id) {
		for (Intern intern : getInterns()) {
			if (intern.getId().equals(id)) {
				return intern;
			} else {
				System.out.println("not found");
			}
		}
		return null;
	}

	public void showInterns() {
		getInterns().forEach(System.out::println);
	}
}
