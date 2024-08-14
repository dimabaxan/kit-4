import java.util.List;


public class Main {
    public static void main(String[] args) {
        EmployeeDirectory directory = new EmployeeDirectory();


        directory.addEmployee(new Employee(1, "025-456-7890", "Alisa", 5));
        directory.addEmployee(new Employee(2, "025-765-4321", "Oleg", 10));
        directory.addEmployee(new Employee(3, "025-555-5555", "Dumitru", 5));


        List<Employee> experiencedEmployees = directory.findEmployeesByExperience(5);
        System.out.println("Employees with 5 years of experience: " + experiencedEmployees);


        List<String> phoneNumbers = directory.findPhoneNumbersByName("Alice");
        System.out.println("Phone numbers for Alice: " + phoneNumbers);


        Employee employee = directory.findEmployeeById(2);
        System.out.println("Employee with ID 2: " + employee);
    }
}
