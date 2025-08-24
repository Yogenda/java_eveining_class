package employeemanagement;

import java.io.Serializable;
import java.util.Date;

// Employee class extending Person
public class Employee extends Person implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String department;
	private double salary;
	private Date joinDate;

	public Employee(int id, String name, String email, String phone, String department, double salary, Date joinDate) {
		super(name, email, phone);
		this.id = id;
		this.department = department;
		this.salary = salary;
		this.joinDate = joinDate;
	}

	// Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	@Override
	public String getDetails() {
		return String.format("ID: %d, Name: %s, Email: %s, Phone: %s, Department: %s, Salary: %.2f, Join Date: %s", id,
				name, email, phone, department, salary, joinDate.toString());
	}

	@Override
	public String toString() {
		return getDetails();
	}
}