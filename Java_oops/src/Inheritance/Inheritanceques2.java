package Inheritance;

// Parent class
class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// Child class
class Employee extends Person {
    double salary;
    int startedyear;
    String insnumber;

    public Employee(String name, double salary, int startedyear, String insnumber) {
        super(name); // call the constructor of Person
        this.salary = salary;
        this.startedyear = startedyear;
        this.insnumber = insnumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getStartedyear() {
    	return startedyear;
    }
    public void setstartedyear() {
    	this.startedyear = startedyear;
    }
    public String getInsnumber() {
    	return insnumber;
    }
    public void setinsnumber() {
    	this.insnumber = insnumber;
    }
}

// Main class
public class Inheritanceques2 {
    public static void main(String[] args) {
        Employee emp = new Employee("Asritha", 50000.0, 2022, "INS123");

        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());
        System.out.println("Year Started: " + emp.startedyear);
        System.out.println("Insurance Number: " + emp.insnumber);
    }
}
