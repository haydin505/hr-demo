package net.dialecticsoftware.hrdemo.repository;

import java.util.List;
import net.dialecticsoftware.hrdemo.entity.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

/**
 * @author huseyinaydin
 */
@Repository
public class EmployeeRepository {

  private final Session session;

  public EmployeeRepository(Session session) {
    this.session = session;
  }

  public List<Employee> getEmployees() {
    Query<Employee> query = session.createQuery("from Employee", Employee.class);
    return query.getResultList();
  }

  public void addEmployee(Employee employee) {
    session.save(employee);
  }

  public void updateEmployee(Employee employee) {

  }

  public Employee getEmployee(Long id) {
    return session.find(Employee.class, id);
  }
}
