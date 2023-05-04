package net.dialecticsoftware.hrdemo.service;

import java.util.List;
import net.dialecticsoftware.hrdemo.dto.request.AddEmployeeRequest;
import net.dialecticsoftware.hrdemo.dto.request.UpdateEmployeeRequest;
import net.dialecticsoftware.hrdemo.entity.Employee;
import net.dialecticsoftware.hrdemo.exception.NotFoundException;
import net.dialecticsoftware.hrdemo.repository.EmployeeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

/**
 * @author huseyinaydin
 */
@Service
@Transactional
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

  public void deleteEmployee(Long employeeId) {
    repository.deleteEmployee(employeeId);
  }

  public Employee getEmployee(Long employeeId) {
    return repository.getEmployee(employeeId);
  }

  public void updateEmployee(Long employeeId, UpdateEmployeeRequest request) throws NotFoundException {
    Employee employee = repository.getEmployee(employeeId);
    if (isNull(employee)) {
      throw new NotFoundException(Employee.class);
    }
    if (nonNull(request.firstname())) {
      employee.setFirstname(request.firstname());
    }
    if (nonNull(request.lastname())) {
      employee.setLastname(request.lastname());
    }
    if (nonNull(request.birthDate())) {
      employee.setBirthDate(request.birthDate());
    }
    if (nonNull(request.department())) {
      employee.setDepartment(request.department());
    }
    if (nonNull(request.salary())) {
      employee.setSalary(request.salary());
    }
    if (nonNull(request.startDate())) {
      employee.setStartDate(request.startDate());
    }
    if (nonNull(request.performance())) {
      employee.setPerformance(request.performance());
    }
    if (nonNull(request.level())) {
      employee.setLevel(request.level());
    }
    repository.updateEmployee(employee);
  }
}
