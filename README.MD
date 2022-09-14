# Ironhack Java Enterprise Backend Development
## Lab 1 - 06

### Instructions

* Create a new GitHub repository named Enterprise-Java-Development-1.06
* Add your instructor and the class graders to your repository and ensure that your repository is private. * Public repositories will receive a zero on the assignment.
* If you are unsure who your class graders are, ask your instructor or refer to the day 1 slide deck.
* Upload the code for all of the following prompts to your repository.
* Submit a URL link to your repository below.
  

### Specifications

* Create an Employee class to represent an employee of a company. Add all relevant properties and behaviors that you might need but you have to include a salary property. Don’t forget to add getters and setters.
* Create an Intern class that extends from Employee. All the Interns have a salary limit of 20000 (constant). You must validate if an intern is created (or salary updated) with a bigger salary than the max. The max value is set.
* Write a program that creates 10 Employees and print it al the properties into a file named employees.txt.


### Technical specifications and dependencies

* Unit testing: JUnit5
* Annotation framework: Lombok
* Custom exceptions
* JavaDoc API documentation
* Shell prompt: Spring Shell
* Grammar checking: CheckStyle

### Usage:

Available custom commands:
> create -> creates 10 employees and saves the result in a file employees.txt

Available default commands:
* quit: exits the application
* exit: quits the application