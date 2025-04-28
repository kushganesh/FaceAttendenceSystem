package com.facerecognitionsystem.service;
import com.facerecognitionsystem.entity.Employee;
import com.facerecognitionsystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImp  implements  EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    // Save or update an employee
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    // Get employee by ID
    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }

    // Get employee by email
//    public Optional<Employee> getEmployeeByEmail(String email) {
//        return employeeRepository.findByEmail(email);
//    }

    // Fetch all employees
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // Fetch active employees
//    public List<Employee> getActiveEmployees() {
//        return employeeRepository.findByActive(true);
//    }




    // Remove an employee by ID
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}
