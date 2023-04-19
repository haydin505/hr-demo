package net.dialecticsoftware.hrdemo.service;

import java.util.List;
import net.dialecticsoftware.hrdemo.dto.request.AddEmployeeRequest;
import net.dialecticsoftware.hrdemo.entity.Employee;
import net.dialecticsoftware.hrdemo.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

/**
 * @author huseyinaydin
 */
@Service
public class EmployeeService {

  private final EmployeeRepository repository;

  public EmployeeService(EmployeeRepository repository) {
    this.repository = repository;
  }

  public void addEmployee(AddEmployeeRequest request) {
    Employee employee = new Employee(request.firstname(),
                                     request.lastname(),
                                     request.birthDate(),
                                     request.department(),
                                     request.salary(),
                                     request.startDate(),
                                     request.level());
    repository.addEmployee(employee);
  }

  public List<Employee> getEmployees() {
    return repository.getEmployees();
  }
}
