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
	private List<Intern> interns;

	public InternRepo() {
		this.interns = new ArrayList<>();
	}

	public boolean addIntern (Intern intern) {
		return this.interns.add(intern);
	}

	public void removeIntern(UUID internID) {
		for (Intern intern : getInterns()) {
			if (intern.getId() == internID) {
				interns.remove(intern);
				System.out.println("Intern " + intern.getName() + "removed.");
			}
		}
	}

	public void showInterns () {
		for (Intern intern : getInterns()) {
			System.out.println(intern.toString());
		}
	}
}
