package employeemanagement;

import java.util.List;

public interface EmployeeOperations {
	void addEmployee(Employee employee) throws EmployeeException;
	void updateEmployee(int id, Employee employee) throws EmployeeException;
	void deleteEmployee(int id) throws EmployeeException;
	Employee getEmployee(int id) throws EmployeeException;
	List<Employee> getAllEmployees();
	List<Employee> searchEmployees(String keyword);
	void exportToTextFile(String filename);
}
