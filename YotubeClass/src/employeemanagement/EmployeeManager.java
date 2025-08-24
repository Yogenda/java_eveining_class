package employeemanagement;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

// Employee Manager class implementing operations
public class EmployeeManager implements EmployeeOperations {
	private List<Employee> employees;
	private static final String FILE_NAME = "employees.dat";

	public EmployeeManager() {
		employees = new ArrayList<>();
		loadEmployeesFromFile();
	}

	@Override
	public void addEmployee(Employee employee) throws EmployeeException {
		if (employee == null) {
			throw new EmployeeException("Employee cannot be null");
		}

		// Check if employee with same ID already exists
		for (Employee emp : employees) {
			if (emp.getId() == employee.getId()) {
				throw new EmployeeException("Employee with ID " + employee.getId() + " already exists");
			}
		}

		// Validate email format using String operations
		if (!isValidEmail(employee.getEmail())) {
			throw new EmployeeException("Invalid email format: " + employee.getEmail());
		}

		employees.add(employee);
		saveEmployeesToFile();
		System.out.println("Employee added successfully: " + employee.getName());
	}

	@Override
	public void updateEmployee(int id, Employee updatedEmployee) throws EmployeeException {
		Employee employee = getEmployee(id);

		// Validate email if changed
		if (!employee.getEmail().equals(updatedEmployee.getEmail()) && !isValidEmail(updatedEmployee.getEmail())) {
			throw new EmployeeException("Invalid email format: " + updatedEmployee.getEmail());
		}

		employee.setName(updatedEmployee.getName());
		employee.setEmail(updatedEmployee.getEmail());
		employee.setPhone(updatedEmployee.getPhone());
		employee.setDepartment(updatedEmployee.getDepartment());
		employee.setSalary(updatedEmployee.getSalary());
		employee.setJoinDate(updatedEmployee.getJoinDate());

		saveEmployeesToFile();
		System.out.println("Employee updated successfully: " + employee.getName());
	}

	@Override
	public void deleteEmployee(int id) throws EmployeeException {
		Employee employee = getEmployee(id);
		employees.remove(employee);
		saveEmployeesToFile();
		System.out.println("Employee deleted successfully: " + employee.getName());
	}

	@Override
	public Employee getEmployee(int id) throws EmployeeException {
		for (Employee employee : employees) {
			if (employee.getId() == id) {
				return employee;
			}
		}
		throw new EmployeeException("Employee with ID " + id + " not found");
	}

	@Override
	public List<Employee> getAllEmployees() {
		return new ArrayList<>(employees);
	}

	@Override
	public List<Employee> searchEmployees(String keyword) {
		List<Employee> result = new ArrayList<>();
		String searchTerm = keyword.toLowerCase();

		for (Employee employee : employees) {
			if (employee.getName().toLowerCase().contains(searchTerm)
					|| employee.getEmail().toLowerCase().contains(searchTerm)
					|| employee.getDepartment().toLowerCase().contains(searchTerm)) {
				result.add(employee);
			}
		}
		return result;
	}

	@Override
	public void exportToTextFile(String filename) {
		try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
			for (Employee employee : employees) {
				writer.println(employee.getDetails());
			}
			System.out.println("Employees exported to " + filename + " successfully.");
		} catch (IOException e) {
			System.out.println("Error exporting to text file: " + e.getMessage());
		}
	}

	private boolean isValidEmail(String email) {
		// Email validation using String operations
		if (email == null || email.trim().isEmpty()) {
			return false;
		}

		String emailPattern = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
		return email.matches(emailPattern);
	}

	// File I/O operations
	@SuppressWarnings("unchecked")
	private void loadEmployeesFromFile() {
		File file = new File(FILE_NAME);
		if (!file.exists()) {
			System.out.println("No existing data file found. Starting with empty employee list.");
			return;
		}

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
			employees = (List<Employee>) ois.readObject();
			System.out.println("Employees loaded from file successfully. Total: " + employees.size());
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Error loading employees from file: " + e.getMessage());
			employees = new ArrayList<>();
		}
	}

	private void saveEmployeesToFile() {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
			oos.writeObject(employees);
		} catch (IOException e) {
			System.out.println("Error saving employees to file: " + e.getMessage());
		}
	}

	// Additional utility methods
	public int getNextEmployeeId() {
		int maxId = 0;
		for (Employee employee : employees) {
			if (employee.getId() > maxId) {
				maxId = employee.getId();
			}
		}
		return maxId + 1;
	}

	public boolean isEmpty() {
		return employees.isEmpty();
	}
}