# IronHack Java Enterprise Backend Development
## Lab 1 - 06

### Specifications

* Create an Employee class to represent an employee of a company. Add all relevant properties and behaviors that you might need, but you have to include a salary property. Don’t forget to add getters and setters.
 
 
* Create an Intern class that extends from Employee. All the Interns have a salary limit of 20000 (constant). You must validate if an intern is created (or salary updated) with a bigger salary than the max. The max value is set.
 
 
* Write a program that creates 10 Employees and print it al the properties into a file named employees.txt.


### Technical specifications and dependencies

* Unit testing: JUnit5

 
* Custom exceptions
 
 
* JavaDoc API documentation
 
 
* Shell prompt: Spring Shell
 
 
* Grammar checking: CheckStyle

### Usage:

* Available custom commands:
> reg-dummy -> creates 10 employees and saves the result in a file employees.txt
> reg-custom-emp -> allows to register an employee by entering its details
> reg-custom-intern -> allows to register a custom intern
> show-emp -> shows a list of registered employees
> show-intern -> shows a list of registered interns
> remove-emp -> removes an employee from the repository
> remove-intern -> removes an intern from the repository
> raise -> raises an intern salary

* Available default commands:
> help: shows a list of available commands and a brief description
> quit: exits the application
> exit: quits the application