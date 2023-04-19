package net.dialecticsoftware.hrdemo.controller;

import java.util.List;
import net.dialecticsoftware.hrdemo.dto.request.AddEmployeeRequest;
import net.dialecticsoftware.hrdemo.entity.Employee;
import net.dialecticsoftware.hrdemo.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huseyinaydin
 */
@RequestMapping("employees")
@RestController
public class EmployeeController {

  private final EmployeeService employeeService;

  public EmployeeController(EmployeeService employeeService) {
    this.employeeService = employeeService;
  }

  @PostMapping
  public ResponseEntity addEmployee(@Validated @RequestBody AddEmployeeRequest request) {
    employeeService.addEmployee(request);
    return ResponseEntity.ok().build();
  }

  @GetMapping
  public ResponseEntity<List<Employee>> getEmployees() {
    return ResponseEntity.ok(employeeService.getEmployees());
  }
}
