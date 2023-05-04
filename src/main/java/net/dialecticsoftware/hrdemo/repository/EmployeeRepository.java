package net.dialecticsoftware.hrdemo.repository;

import java.util.List;
import javax.persistence.EntityManager;
import net.dialecticsoftware.hrdemo.entity.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import static java.util.Objects.nonNull;

/**
 * @author huseyinaydin
 */
@Repository
public class EmployeeRepository {

  private final Session session;

  private final EntityManager entityManager;

  public EmployeeRepository(EntityManager entityManager, Session session) {
    this.session = session;
    this.entityManager = entityManager;
  }

  public List<Employee> getEmployees() {
    Query<Employee> query = session.createQuery("from Employee", Employee.class);
    return query.getResultList();
  }

  public void addEmployee(Employee employee) {
    session.save(employee);
  }

  public void updateEmployee(Employee employee) {
    session.update(employee);
  }

  public Employee getEmployee(Long id) {
    return session.find(Employee.class, id);
  }

  public void deleteEmployee(Long id) {
    Employee employee = session.find(Employee.class, id);
    if (nonNull(employee)) {
      session.remove(employee);
    }
  }
}
