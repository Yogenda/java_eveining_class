package employeemanagement;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

// Main class with user interface
public class EmployeeManagementSystem {
	private static EmployeeManager employeeManager = new EmployeeManager();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("=== Employee Management System ===");

		while (true) {
			displayMenu();
			int choice = getIntInput("Enter your choice: ");

			try {
				switch (choice) {
				case 1 -> addEmployee();
				case 2 -> viewAllEmployees();
				case 3 -> updateEmployee();
				case 4 -> deleteEmployee();
				case 5 -> searchEmployees();
				case 6 -> viewEmployee();
				case 7 -> exportToTextFile();
				case 8 -> {
					System.out.println("Thank you for using Employee Management System!");
					return;
				}
				default -> System.out.println("Invalid choice! Please try again.");
				}
			} catch (EmployeeException e) {
				System.out.println("Error: " + e.getMessage());
			} catch (Exception e) {
				System.out.println("Unexpected error: " + e.getMessage());
				e.printStackTrace();
			}

			System.out.println("\nPress Enter to continue...");
			scanner.nextLine();
		}
	}

	private static void displayMenu() {
		System.out.println("\n===== MAIN MENU =====");
		System.out.println("1. Add Employee");
		System.out.println("2. View All Employees");
		System.out.println("3. Update Employee");
		System.out.println("4. Delete Employee");
		System.out.println("5. Search Employees");
		System.out.println("6. View Employee Details");
		System.out.println("7. Export to Text File");
		System.out.println("8. Exit");
		System.out.println("=====================");
	}

	private static void addEmployee() throws EmployeeException {
		System.out.println("\n--- Add New Employee ---");

		int id = employeeManager.getNextEmployeeId();
		System.out.println("Generated Employee ID: " + id);

		String name = getStringInput("Enter Name: ");
		String email = getStringInput("Enter Email: ");
		String phone = getStringInput("Enter Phone: ");
		String department = getStringInput("Enter Department: ");
		double salary = getDoubleInput("Enter Salary: ");

		Employee employee = new Employee(id, name, email, phone, department, salary, new Date());
		employeeManager.addEmployee(employee);
	}

	private static void viewAllEmployees() {
		System.out.println("\n--- All Employees ---");

		if (employeeManager.isEmpty()) {
			System.out.println("No employees found.");
			return;
		}

		List<Employee> employees = employeeManager.getAllEmployees();
		for (int i = 0; i < employees.size(); i++) {
			System.out.println((i + 1) + ". " + employees.get(i).getDetails());
		}
		System.out.println("Total employees: " + employees.size());
	}

	private static void updateEmployee() throws EmployeeException {
		System.out.println("\n--- Update Employee ---");

		if (employeeManager.isEmpty()) {
			System.out.println("No employees available to update.");
			return;
		}

		int id = getIntInput("Enter Employee ID to update: ");

		// Get existing employee to pre-fill values
		Employee existing = employeeManager.getEmployee(id);
		System.out.println("Current details: " + existing.getDetails());

		String name = getStringInput("Enter new Name (current: " + existing.getName() + "): ");
		String email = getStringInput("Enter new Email (current: " + existing.getEmail() + "): ");
		String phone = getStringInput("Enter new Phone (current: " + existing.getPhone() + "): ");
		String department = getStringInput("Enter new Department (current: " + existing.getDepartment() + "): ");
		double salary = getDoubleInput("Enter new Salary (current: " + existing.getSalary() + "): ");

		// Use existing values if new values are empty
		Employee updated = new Employee(id, name.isEmpty() ? existing.getName() : name,
				email.isEmpty() ? existing.getEmail() : email, phone.isEmpty() ? existing.getPhone() : phone,
				department.isEmpty() ? existing.getDepartment() : department,
				salary == 0 ? existing.getSalary() : salary, existing.getJoinDate());

		employeeManager.updateEmployee(id, updated);
	}

	private static void deleteEmployee() throws EmployeeException {
		System.out.println("\n--- Delete Employee ---");

		if (employeeManager.isEmpty()) {
			System.out.println("No employees available to delete.");
			return;
		}

		int id = getIntInput("Enter Employee ID to delete: ");

		Employee employee = employeeManager.getEmployee(id);
		System.out.println("Employee to delete: " + employee.getDetails());

		System.out.print("Are you sure you want to delete this employee? (yes/no): ");
		String confirm = scanner.nextLine().trim().toLowerCase();

		if ("yes".equals(confirm) || "y".equals(confirm)) {
			employeeManager.deleteEmployee(id);
		} else {
			System.out.println("Deletion cancelled.");
		}
	}

	private static void searchEmployees() {
		System.out.println("\n--- Search Employees ---");

		if (employeeManager.isEmpty()) {
			System.out.println("No employees available to search.");
			return;
		}

		String keyword = getStringInput("Enter search keyword (name, email, or department): ");

		List<Employee> results = employeeManager.searchEmployees(keyword);

		if (results.isEmpty()) {
			System.out.println("No employees found matching: '" + keyword + "'");
			return;
		}

		System.out.println("Search results for '" + keyword + "':");
		for (int i = 0; i < results.size(); i++) {
			System.out.println((i + 1) + ". " + results.get(i).getDetails());
		}
		System.out.println("Found " + results.size() + " employee(s)");
	}

	private static void viewEmployee() throws EmployeeException {
		System.out.println("\n--- View Employee Details ---");

		if (employeeManager.isEmpty()) {
			System.out.println("No employees available to view.");
			return;
		}

		int id = getIntInput("Enter Employee ID: ");

		Employee employee = employeeManager.getEmployee(id);
		System.out.println("\nEmployee Details:");
		System.out.println("ID: " + employee.getId());
		System.out.println("Name: " + employee.getName());
		System.out.println("Email: " + employee.getEmail());
		System.out.println("Phone: " + employee.getPhone());
		System.out.println("Department: " + employee.getDepartment());
		System.out.println("Salary: " + employee.getSalary());
		System.out.println("Join Date: " + employee.getJoinDate());
	}

	private static void exportToTextFile() {
		System.out.println("\n--- Export to Text File ---");

		if (employeeManager.isEmpty()) {
			System.out.println("No employees available to export.");
			return;
		}

		String filename = getStringInput("Enter filename (default: employees_export.txt): ");

		if (filename.isEmpty()) {
			filename = "employees_export.txt";
		}

		employeeManager.exportToTextFile(filename);
	}

	// Utility methods for input handling
	private static String getStringInput(String prompt) {
		System.out.print(prompt);
		return scanner.nextLine().trim();
	}

	private static int getIntInput(String prompt) {
		while (true) {
			try {
				System.out.print(prompt);
				return Integer.parseInt(scanner.nextLine().trim());
			} catch (NumberFormatException e) {
				System.out.println("Invalid input! Please enter a valid number.");
			}
		}
	}

	private static double getDoubleInput(String prompt) {
		while (true) {
			try {
				System.out.print(prompt);
				return Double.parseDouble(scanner.nextLine().trim());
			} catch (NumberFormatException e) {
				System.out.println("Invalid input! Please enter a valid number.");
			}
		}
	}
}